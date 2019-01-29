package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color = "geltainen";

        public Pixel() {
            System.out.println("Pixel Created");
        }

    public void print() {
        //System.out.println("Print : " +color +" x : " +getX() +" y : " +getY());
        //System.out.println("Print : x = " +x +" y = " +y +" color = " +color);
        super.print();
        System.out.println(color);
    }
}