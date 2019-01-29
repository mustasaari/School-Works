
import coordinate.Point;
import displaydevice.Pixel;

class Main {      

    public static void main(String[] Args) {

        //Pixel pi = new Pixel();
        //pi.setX(7);
        //pi.setY(8);
        //pi.color = "Keltainen";
        //pi.x = 8;
        //pi.y = 9;

        //Pixel pi = new Pixel(); //<-- toimii
        //pi.print();   //tästä metodista päästään x ja y kiinni

        Pixel a = new Pixel();  //ei toimi
        a.x = 4;                //x has protected access in Point
        a.y = 10;               //y has protected access in Point
        a.color = "punainen";   //color has private access in Pixel
        a.print();

        //Point a = new Point(); //ei toimi
        //a.x = 4;        //x has protected access in Point
        //a.y = 10;       //y has protected access in Point

        
    }

}