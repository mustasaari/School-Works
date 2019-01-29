
import coordinate.Point;
import displaydevice.Pixel;

class Main {        ////kun on privatet niin päästään käsiksi vaan classin sisältä "has private access in Point"

    public static void main(String[] Args) {

        Pixel pi = new Pixel();
        pi.setX(7);
        pi.setY(8);
        //pi.color = "Keltainen";

        //System.out.println("Vastaus on : " +po.x +" " +po.y +" " +pi.x +" " +pi.y +" " + pi.color);

        //po.print();
        pi.print();
        
    }

}