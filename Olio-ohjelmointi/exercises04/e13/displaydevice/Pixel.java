package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color = "geltainen";

        public Pixel() {
            System.out.println("Pixel Created");
        }

        public Pixel(int a, int b, String c) {
            super(a,b);
            System.out.println("Pixel Created (parameter contructor)");
            color = c;
        }

    @Override          
    public void print() {
        //System.out.println("Print : " +color +" x : " +getX() +" y : " +getY());
        //System.out.println("Print : x = " +x +" y = " +y +" color = " +color);
        super.print();
        System.out.println(color);
    }

    public void setColor(String a) {
        color = a;
    }

    public String getColor() {
        return color;
    }

}