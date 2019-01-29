
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Node;

public class Main extends Application {
   @Override
   public void start(Stage stage) {
      stage.setTitle("JavaFX HelloWorld!");
      //stage.initStyle(StageStyle.DECORATED);    //näytti normaalilta
      //stage.initStyle(StageStyle.UNDECORATED);  //ei näyttänyt oikein miltään
      //stage.initStyle(StageStyle.TRANSPARENT);  //sama, ei näy mitään
      //stage.initStyle(StageStyle.UNIFIED);    //tausta refreshaa paremmin?
      //stage.initStyle(StageStyle.UTILITY);    //sulkunappi eri

      //Button button1 = new Button("yksi");
      //Button button2 = new Button("kaksi");

      Group group = new Group(new Button("Hello"), new Button("World"));
      //group.setTranslateX(50);    //siirtää kaikkia
      //Group group = new Group();
      //group.getChildren().add(button1);
      //button2.setTranslateX(600);
      //button2.setTranslateY(450);
      //group.getChildren().add(button2);
      Scene scene = new Scene(group, 640, 480);

      
      stage.setScene(scene);
      //stage.setWidth(640);
      //stage.setHeight(480);
      stage.centerOnScreen();
      stage.show();
      System.out.println("start");

      //Node tmpNode = group.getChildren().get(0);
      //tmpNode.setTranslateY(50);

      for( Node child: group.getChildren() ) {   //Childien hakua
          System.out.println("lapsi id" +child.getId() ); //idnull
          if (child instanceof Button) {
              Button tmp = (Button) child;
             if (tmp.getText().equals("World") ) {
                tmp.setTranslateX(640 - tmp.getWidth());
                tmp.setTranslateY(480 - tmp.getHeight());
             }
          }
      }

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
}