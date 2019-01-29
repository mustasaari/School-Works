
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Slider;
import javafx.geometry.Orientation;



public class Main extends Application {
   @Override
   public void start(Stage stage) {
    stage.setTitle("JavaFX HelloWorld!");

    Button luckyButton = new Button("I Feel Lucky");
    Button button2 = new Button(Integer.toString(88) );

      //Group group = new Group(new Button("Hello"), new Button("World"));
    BorderPane borderPane = new BorderPane();
    GridPane gridPane = generateGridPane();
    VBox vbox = new VBox(2);
    Slider slider = new Slider();
    slider.setOrientation(Orientation.VERTICAL);

      //GridPane.setRowIndex(button2, 0);
      //GridPane.setColumnIndex(button2, 1);

      //gridPane.add(new Button(Integer.toString(88) ), 1, 0); // column=1 row=0
      //gridPane.add(new Button("7"), 2, 2);  // column=2 row=0


    Text topText = new Text("Choose numbers");

    MenuBar menuBar = new MenuBar();                //menubar creation
    Menu fileMenu = new Menu("File");
    Menu skillMenu = new Menu("Skill Level");
    MenuItem highScoreMenu = new MenuItem("Highscores");

    RadioMenuItem musicSetting = new RadioMenuItem("Background music");
    fileMenu.getItems().add(musicSetting);
    fileMenu.getItems().add(skillMenu);
    fileMenu.getItems().add(highScoreMenu);

    MenuItem exitMenu = new MenuItem("Exit");

    RadioMenuItem radioItem1 = new RadioMenuItem("Option 1");   //radiobuttons
    RadioMenuItem radioItem2 = new RadioMenuItem("Option 2");
    RadioMenuItem radioItem3 = new RadioMenuItem("Option 3");

    ToggleGroup toggleGroup = new ToggleGroup();    //togglegroup hommelit
    radioItem1.setToggleGroup(toggleGroup);
    radioItem2.setToggleGroup(toggleGroup);
    radioItem3.setToggleGroup(toggleGroup);

    skillMenu.getItems().add(radioItem1);
    skillMenu.getItems().add(radioItem2);
    skillMenu.getItems().add(radioItem3);

    //menuFile.getItems().add(menuSkill);
    fileMenu.getItems().add(exitMenu);

    Menu editMenu = new Menu("Edit");               //EDIT
    MenuItem cutMenu = new MenuItem("Cut");
    MenuItem copyMenu = new MenuItem("Copy");
    MenuItem pasteMenu = new MenuItem("Paste");
    editMenu.getItems().add(cutMenu);
    editMenu.getItems().add(copyMenu);
    editMenu.getItems().add(pasteMenu);

    Menu aboutMenu = new Menu("About");
    MenuItem aboutAppMenu = new MenuItem("About Lotto App");
    aboutMenu.getItems().add(aboutAppMenu);

    menuBar.getMenus().addAll(fileMenu, editMenu, aboutMenu);









    vbox.getChildren().addAll(menuBar, topText);    //add objects to vbox
    vbox.setMargin(topText, new Insets(10) );
    vbox.setAlignment(Pos.TOP_CENTER);

    borderPane.setTop(vbox);
    borderPane.setBottom(luckyButton);
    borderPane.setCenter(gridPane);
    borderPane.setRight(slider);
    borderPane.setAlignment(gridPane, Pos.TOP_CENTER);
    BorderPane.setAlignment(luckyButton, Pos.TOP_CENTER);
    BorderPane.setAlignment(button2, Pos.TOP_LEFT);

    Insets inset = new Insets(10);
    BorderPane.setMargin(luckyButton, inset);
    BorderPane.setMargin(slider, inset);
    //borderPane.setPadding(new Insets(15));                  //Ongelmapadding
      //group.setTranslateX(50);    //siirtää kaikkia
      //Group group = new Group();
      //group.getChildren().add(button1);
      //button2.setTranslateX(600);
      //button2.setTranslateY(450);
      //group.getChildren().add(button2);
    Scene scene = new Scene(borderPane, 640, 480);

      
    stage.setScene(scene);
        //stage.setWidth(640);
        //stage.setHeight(480);
    stage.centerOnScreen();
    stage.show();
    System.out.println("start");

      //Node tmpNode = group.getChildren().get(0);
      //tmpNode.setTranslateY(50);
        /*
      for( Node child: group.getChildren() ) {   //Childien hakua
          System.out.println("lapsi id" +child.getId() ); //idnull
          if (child instanceof Button) {
              Button tmp = (Button) child;
             if (tmp.getText().equals("World") ) {
                tmp.setTranslateX(640 - tmp.getWidth());
                tmp.setTranslateY(480 - tmp.getHeight());
             }
          }
      }*/

    } 
    public static void main(String args[]){
        launch(args);
    }

    public void init () { 
        System.out.println("init");
    }

    public void stop() {
        System.out.println("stop");
    }

    public Main() {
        System.out.println("constructor");
    }

    public GridPane generateGridPane() {
        GridPane toReturn = new GridPane();
        toReturn.setHgap(7);
        toReturn.setVgap(6);

        toReturn.setPrefSize(600, 400);

        int tmpCounter = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                Button tmpButton = new Button(Integer.toString(tmpCounter));
                tmpButton.setMaxWidth(Double.MAX_VALUE);
                tmpButton.setMaxHeight(Double.MAX_VALUE);
                toReturn.add(tmpButton ,j ,i);
                tmpCounter++;
                if (tmpCounter > 40) break;
            }
        }

        ColumnConstraints c = new ColumnConstraints();
        RowConstraints r = new RowConstraints();
        c.setPercentWidth(15);
        r.setPercentHeight(16);
        toReturn.getColumnConstraints().addAll(c,c,c,c,c,c,c);
        toReturn.getRowConstraints().addAll(r,r,r,r,r,r);
        return toReturn;
    }
}