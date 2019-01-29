import model.*;
import java.util.*;

class Main {
    public static void main (String[] args) {
        System.out.println("hello again world");

        Polygon poly = new Polygon();
        poly.addPoint(2,4);
        poly.addPoint(4,7);
        poly.addPoint(7,9);
        poly.addPoint(9,2);
        poly.color.printColor();


        //Point point1 = new Point();
        //Point point2 = new Point();
       // Color color = new Color();

        //poly.addPoint(point1);
        //poly.addPoint(point2);

        poly.color.setColor(5,5,5);
        poly.color.printColor();


        ArrayList test = poly.getPoints();
    }


}