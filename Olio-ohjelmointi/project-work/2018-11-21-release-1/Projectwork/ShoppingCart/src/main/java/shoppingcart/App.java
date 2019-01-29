package shoppingcart;

import jsonparser.Parser;

//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


//import javax.swing.*;

//MUISTA AINA MVN INSTALL

class App {

    public static void main( String[] args ) {
        System.out.println("Mikko Mustasaari Shopping Cart");
        Parser parser = new Parser();
        parser.test();
        parser.add("Mikko", "Mustasaarix");
        parser.add("Mikko", 35);
        parser.write();

        //JFrame frame = new JFrame("Simple GUI");             //SWING IKKUNA KÄYNNISTYS
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setVisible(true);

        JavaFXWindow window = new JavaFXWindow();
        window.go();
    }
}