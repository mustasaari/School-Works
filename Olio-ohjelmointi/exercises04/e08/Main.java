
import coordinate.Point;
import displaydevice.Pixel;

class Main {      

    public static void main(String[] Args) {

        Pixel p = new Pixel();  //Point created, pixel created
                //pixel contructorin eteen tulee super (ennen printtia), jolloin point luodaan ennen pixeliä

        Point o = new Point();  //point created    

        Point p2 = new Point(4,4); 


        //p.print();
        
    }

}