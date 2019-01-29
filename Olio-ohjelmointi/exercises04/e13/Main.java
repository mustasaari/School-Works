
import coordinate.Point;
import displaydevice.Pixel;

class Main {      

    public static void main(String[] Args) {

        Pixel pixel = new Pixel();
        Point point = new Point();
        String str = "yay";

        method1(point);     //mitkä extendaa pointtia
        method1(pixel);

        //method2(point); //Point cannot be converted to Pixel
        method2(pixel);     //mitkä extendaa pixeliä

        method3(pixel); //toimii //mikät extendaa objectia
        method3(point);   //toimii
        method3(str);        //toimii

    }
    public static void method1(Point point) {       //pointin metodit
        // point.whatMethodsCanIUse();   
        point.setX(7);
        System.out.println(point.toString());
    }
    public static void method2(Pixel pixel) {       //pixelin ja pointin metodit
        pixel.setX(9);
        pixel.setColor("sini");
        System.out.println(pixel.toString());
        // pixel.whatMethodsCanIUse();
    }
    public static void method3(Object object) {     //Object luokan metodit
        System.out.println(object.toString());
        // object.whatMethodsCanIUse();
    }

}