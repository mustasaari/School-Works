
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
   @Override
   public void start(Stage stage) {
      stage.setTitle("JavaFX HelloWorld!");
      stage.show();
   } 
   public static void main(String args[]){
      launch(args);
   }

   public void init () { 
       System.out.println("init");
   }
}