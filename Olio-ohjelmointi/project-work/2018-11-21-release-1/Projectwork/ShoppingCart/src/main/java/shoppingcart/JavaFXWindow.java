package shoppingcart;

import jsonparser.Parser;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

//import javax.swing.*;




public class JavaFXWindow extends Application {

    public void go() {
        launch();
    }

    @Override
    public void start(Stage stage) {

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
        Button button1 = new Button("yayy");

        borderPane.setBottom(button1);


        stage.setScene(scene);
        stage.setTitle("JavaFX HelloWorld!");
        stage.show();
    }


}