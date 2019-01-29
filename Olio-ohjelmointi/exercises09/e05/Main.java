
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
//import javafx.scene.layout.Region;



public class Main extends Application {
   @Override
   public void start(Stage stage) {
    stage.setTitle("JavaFX HelloWorld!");
      //stage.initStyle(StageStyle.DECORATED);    //näytti normaalilta
      //stage.initStyle(StageStyle.UNDECORATED);  //ei näyttänyt oikein miltään
      //stage.initStyle(StageStyle.TRANSPARENT);  //sama, ei näy mitään
      //stage.initStyle(StageStyle.UNIFIED);    //tausta refreshaa paremmin?
      //stage.initStyle(StageStyle.UTILITY);    //sulkunappi eri

    Button luckyButton = new Button("I Feel Lucky");
    Button button2 = new Button(Integer.toString(88) );

      //Group group = new Group(new Button("Hello"), new Button("World"));
    BorderPane borderPane = new BorderPane();
    GridPane gridPane = generateGridPane();
      //GridPane.setRowIndex(button2, 0);
      //GridPane.setColumnIndex(button2, 1);

      //gridPane.add(new Button(Integer.toString(88) ), 1, 0); // column=1 row=0
      //gridPane.add(new Button("7"), 2, 2);  // column=2 row=0

    Text topText = new Text("Choose numbers");
    borderPane.setTop(topText);
    borderPane.setBottom(luckyButton);
    borderPane.setCenter(gridPane);
    borderPane.setAlignment(gridPane, Pos.TOP_CENTER);
    BorderPane.setAlignment(luckyButton, Pos.TOP_CENTER);
    BorderPane.setAlignment(topText, Pos.TOP_CENTER);
    borderPane.setPadding(new Insets(15));
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