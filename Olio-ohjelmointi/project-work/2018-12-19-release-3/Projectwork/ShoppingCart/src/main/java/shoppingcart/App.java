package shoppingcart;

import jsonparser.Parser;


/**
 * Shopping Cart Application
 *
 * User can add and modify contents of the shopping cart.
 * This class launches javafx window.
 *
 * @author Mikko Mustasaari
 * @version 2017.1214
 * @since 1.0
 */

class App {

    /**
     * Start method of program.
     * Launches javafx window.
     * @param args Command line parameters. Not used.
     */

    public static void main( String[] args ) {
        System.out.println("Mikko Mustasaari Shopping Cart");
        Parser parser = new Parser();
        parser.test();

        JavaFXWindow window = new JavaFXWindow();
        window.go();
    }
}