
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
   @Override
   public void start(Stage stage) {
      stage.setTitle("JavaFX HelloWorld!");
      //stage.initStyle(StageStyle.DECORATED);    //näytti normaalilta
      //stage.initStyle(StageStyle.UNDECORATED);  //ei näyttänyt oikein miltään
      //stage.initStyle(StageStyle.TRANSPARENT);  //sama, ei näy mitään
      //stage.initStyle(StageStyle.UNIFIED);    //tausta refreshaa paremmin?
      //stage.initStyle(StageStyle.UTILITY);    //sulkunappi eri
      stage.setWidth(640);
      stage.setHeight(480);
      stage.centerOnScreen();
      stage.show();
      System.out.println("start");
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