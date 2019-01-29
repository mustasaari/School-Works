package shoppingcart;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;
import jsonparser.Parser;

import java.io.File;


/**
 * Main window of program.
 *
 * @author Mikko Mustasaari
 * @version 2017.1214
 * @since 1.0
 */


public class JavaFXWindow extends Application {

    /**
     * TableView for displaying ShoppingCartItem objects
     */

    TableView<ShoppingCartItem> table;

    /**
     * Button for changing name or adding new items
     */

    Button buttonAdd;

    /**
     * Button for removing items
     */

    Button buttonRemove;

    /**
     * Textfield for name
     */

    TextField nameTextField;

    /**
     * Textfield for quantity
     */
    TextField qtyTextField;


    /**
     * Launches window
     */

    public void go() {
        launch();
    }

    /**
     * Method for setting up window layout, listeners and actions.
     * Sets up Observablelist for storing ShoppingCartItem objects
     * Opens window.
     * @param stage main stage
     */

    @Override
    public void start(Stage stage) {

        final ObservableList<ShoppingCartItem> data = FXCollections.observableArrayList();
        table = new TableView();

        TableColumn item = new TableColumn("Item Name");       //column name
        TableColumn quantity = new TableColumn("Quantity");    //column quantity
        item.setMinWidth(200);      //column width
        quantity.setMinWidth(100);  //column width

        item.setCellValueFactory(new PropertyValueFactory<>("itemName"));          //reference
        quantity.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));  //reference

        table.setItems(data);   //set items
        table.getColumns().addAll(item, quantity);  //add columns

        BorderPane borderPane = new BorderPane();   //create borderpane
        GridPane leftGridPane = new GridPane();     //create gridpane
        Text text1 = new Text("Shopping Cart Item");    //text1
        Text text2 = new Text("Quantity");              //text2

        leftGridPane.setHgap(10);
        leftGridPane.setVgap(10);
        leftGridPane.setPadding(new Insets(10));
        leftGridPane.add(text1, 0,0);
        leftGridPane.add(text2, 1,0);

        Scene scene = new Scene(borderPane, 640, 480);
        VBox vBox = new VBox();                 //holds toolbar
        VBox topVbox = new VBox(3);     //holds toolbar

        buttonAdd = new Button("Add Item / Modify Quantity");
        buttonRemove = new Button("Remove Item");
        nameTextField = new TextField ();             //textfield for name
        qtyTextField = new TextField();           //textfield for quantity
        qtyTextField.setPrefWidth(50);

        MenuBar menu = new MenuBar();                       //toolbar menu
        Menu menuitem1 = new Menu("File");
        MenuItem saveMenu = new MenuItem("Save");
        menuitem1.getItems().add(saveMenu);
        menu.getMenus().addAll(menuitem1);
        VBox centerVBox = new VBox();                           //vbox center
        centerVBox.setPadding(new Insets(30));

        leftGridPane.add(nameTextField, 0, 1);
        leftGridPane.add(qtyTextField, 1,1);

        stage.setMinWidth(520);

        ListView<String> cartList = new ListView<String>();
        cartList.setMinWidth(300);
        cartList.setPadding(new Insets(10));
        centerVBox.getChildren().addAll(table);

        nameTextField.setMinWidth(150);
        nameTextField.setPrefWidth(150);
        buttonAdd.setMinWidth(220);
        buttonRemove.setMinWidth(220);
        buttonAdd.setPadding(new Insets(10));
        buttonRemove.setPadding(new Insets(10));

        buttonAdd.setOnAction(value ->  { //ADD BUTTON
            addButton(data);
        });

        buttonRemove.setOnAction(value ->  {  //REMOVE BUTTON
            ShoppingCartItem selectedItem = table.getSelectionModel().getSelectedItem();
            table.getItems().remove(selectedItem);
        });

        table.getSelectionModel().selectedItemProperty().addListener((obs) -> {
            if (table.getItems().size() > 0) {
                ShoppingCartItem selectedItem = table.getSelectionModel().getSelectedItem();
                nameTextField.setText(selectedItem.getItemName());
                qtyTextField.setText(selectedItem.getItemQuantity());
            }
        });

        nameTextField.textProperty().addListener((observable) -> {
            textFieldListen();
        });

        saveMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                saveJson(stage);
            }
        });

        leftGridPane.add(buttonAdd,0,3, 2, 3);
        leftGridPane.add(buttonRemove, 0,6, 2 ,6);

        vBox.setPadding(new Insets(30,10,10,10));
        vBox.setSpacing(10);  //Space between buttons

        topVbox.getChildren().addAll(menu);
        borderPane.setLeft(leftGridPane);
        borderPane.setTop(topVbox);
        borderPane.setCenter(centerVBox);

        stage.setScene(scene);
        stage.setTitle("Shopping Cart!");
        stage.show();
    }

    /**
     * Method for iterating shopping list and saving it to a file.
     * Uses filechooser.
     * @param stage Main stage of program.
     */

    public void saveJson(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Shopping List");
        FileChooser.ExtensionFilter jsonFilter = new FileChooser.ExtensionFilter("JSON file (*.json)", "*.json");
        fileChooser.getExtensionFilters().add(jsonFilter);
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            Parser parserSave = new Parser();
                for (ShoppingCartItem x : table.getItems()) {
                    parserSave.add(x.getItemName(), x.getItemQuantity());
                }
            parserSave.write(file);
        }
    }

    /**
     * Add button. When add is pressed checks that textFields are not empty
     * Then checks that if duplicate name is found.
     * If duplicate is found, quantity is modified instead of adding new item
     * @param data Array of ShoppingCartItemObjects
     */

    public void addButton(ObservableList<ShoppingCartItem> data) {
        String itemName = "";
        itemName = nameTextField.getText();
        String qty = "";
        qty = qtyTextField.getText();
        boolean dublicateValue = false;

        if (!itemName.equals("") && !qty.equals("")) {
            for (ShoppingCartItem x : table.getItems()) {   //check duplicates
                if (itemName.equals(x.getItemName())) {
                    dublicateValue = true;
                    x.setItemQuantity(qty);
                    table.refresh();
                }
            }

            if (!dublicateValue) {
                data.add(new ShoppingCartItem(itemName, qty));
                for (ShoppingCartItem x : table.getItems()) {   //check duplicates
                    if (itemName.equals(x.getItemName())) {
                        table.getSelectionModel().select(x);
                    }
                }
            }
        }
        else {
            buttonAdd.setText("Missing data");
        }
    }

    /**
     * Listener method for textfield.
     * Checks if nameTextField contains data already in array.
     * If so, selects current item from panel, and changes add button text to "change quantity"
     */

    public void textFieldListen() {
        for (ShoppingCartItem x : table.getItems()) {
            if (nameTextField.getText().equals(x.getItemName())) {
                buttonAdd.setText("Change quantity");
                table.getSelectionModel().select(x);
                break;
            } else {
                buttonAdd.setText("Add");
            }
        }
    }
}