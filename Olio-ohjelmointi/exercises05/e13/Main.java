import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    public static void main(String[] args) {
            launch(args);
    }

    public void start ( Stage stage ) {
        Button nappi = new Button("nappi");
        Scene scene = new Scene(nappi, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}