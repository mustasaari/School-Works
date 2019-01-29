package shoppingcart;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
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

//import javax.swing.*;




public class JavaFXWindow extends Application {

    public void go() {
        launch();
    }

    @Override
    public void start(Stage stage) {

        final ObservableList<ShoppingCartItem> data = FXCollections.observableArrayList(
                //new ShoppingCartItem("Maito", "8", "oldinfo"),
        );


        TableView<ShoppingCartItem> table = new TableView();        //table
        TableColumn item = new TableColumn("Item Name");       //column name
        TableColumn quantity = new TableColumn("Quantity");    //column quantity

        item.setMinWidth(200);      //column width
        quantity.setMinWidth(100);  //column width

        item.setCellValueFactory(new PropertyValueFactory<>("itemName"));       //reference
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

        Button button1 = new Button("Add Item");
        Button button2 = new Button("Remove Item");
        TextField textField = new TextField ();             //textfield for name

        TextField qtyTextField = new TextField();           //textfield for quantity
        qtyTextField.setPrefWidth(50);

        MenuBar menu = new MenuBar();                       //toolbar menu
        Menu menuitem1 = new Menu("File");
        MenuItem saveMenu = new MenuItem("Save");
        menuitem1.getItems().add(saveMenu);
        menu.getMenus().addAll(menuitem1);
        VBox centerVBox = new VBox();                           //vbox center
        centerVBox.setStyle("-fx-background-color: #228877;");
        centerVBox.setPadding(new Insets(30));

        leftGridPane.add(textField, 0, 1);
        leftGridPane.add(qtyTextField, 1,1);

        StackPane invisible1 = new StackPane();
        invisible1.setMinWidth(100);
        invisible1.setStyle("-fx-background-color: #119966;");
        StackPane invisible2 = new StackPane();
        invisible2.setMinWidth(50);
        invisible2.setStyle("-fx-background-color: #415936;");
        StackPane invisible3 = new StackPane();
        invisible3.setMinHeight(50);
        invisible3.setStyle("-fx-background-color: #992233;");

        //HBox hBox = new HBox(2);
        //hBox.getChildren().addAll(textField);
        //textField.setMinHeight(50);
        stage.setMinWidth(520);

        ListView<String> cartList = new ListView<String>();
        cartList.setMinWidth(300);
        cartList.setPadding(new Insets(10));
        centerVBox.getChildren().addAll(table);

        textField.setMinWidth(150);
        textField.setPrefWidth(150);
        button1.setMinWidth(220);
        button2.setMinWidth(220);
        button1.setPadding(new Insets(10));
        button2.setPadding(new Insets(10));

        button1.setOnAction(value ->  { //ADD BUTTON
            String itemName = "";
            itemName = textField.getText();
            String qty = "";
            qty = qtyTextField.getText();
            boolean dublicateValue = false;

            //button1.setText("Clicked!");
            if (!itemName.equals("") && !qty.equals("")) {

                for (ShoppingCartItem x : table.getItems()) {   //check duplicates
                    if (itemName.equals(x.getItemName())) {
                        //x.setItemQuantity(qty);
                        dublicateValue = true;
                        x.setItemQuantity(qty);
                        //data.add(new ShoppingCartItem("kek", "bur"));
                        table.refresh();
                    }
                }

                if (!dublicateValue) {
                    data.add(new ShoppingCartItem(itemName, qty));
                }
                //textField.clear();
                //qtyTextField.clear();
            }
            else {
                button1.setText("Missing data");
            }


        });

        button2.setOnAction(value ->  {  //REMOVE BUTTON
            //button1.setText("Clicked!");
            ShoppingCartItem selectedItem = table.getSelectionModel().getSelectedItem();
            table.getItems().remove(selectedItem);

            //for (ShoppingCartItem x : table.getItems()) {
            //    System.out.println(x.getItemName());
            //}
        });

        table.getSelectionModel().selectedItemProperty().addListener((obs) -> {
            //if (newSelection != null) {
            if (table.getItems().size() > 0) {
                ShoppingCartItem selectedItem = table.getSelectionModel().getSelectedItem();
                textField.setText(selectedItem.getItemName());
                qtyTextField.setText(selectedItem.getItemQuantity());
            }
            //}
        });

        textField.textProperty().addListener((observable) -> {
            System.out.println("textfield listener");
            for (ShoppingCartItem x : table.getItems()) {
                if (textField.getText().equals(x.getItemName())) {
                    button1.setText("Change quantity");
                    table.getSelectionModel().select(x);
                    break;
                } else {
                    button1.setText("Add");
                }
            }
        });

        leftGridPane.add(button1,0,3, 2, 3);
        leftGridPane.add(button2, 0,6, 2 ,6);

        //leftGridPane.add(button2, 0,3);

        vBox.setPadding(new Insets(30,10,10,10));
        vBox.setSpacing(10);  //Space between buttons
        //vBox.getChildren().addAll(textField, button1, button2);   //28.11

        topVbox.getChildren().addAll(menu);

        //borderPane.setRight(invisible2);
        //borderPane.setLeft(vBox); //28.11
        borderPane.setLeft(leftGridPane);
        borderPane.setBottom(invisible3);
        borderPane.setTop(topVbox);
        borderPane.setCenter(centerVBox);
        borderPane.setStyle("-fx-background-color: #336699;");


        stage.setScene(scene);
        stage.setTitle("Shopping Cart!");
        stage.show();
    }
}