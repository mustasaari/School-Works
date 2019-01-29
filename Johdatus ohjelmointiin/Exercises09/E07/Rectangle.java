import java.util.*;



class Rectangle {
    public int w = 5;                           // <<--- intissä tästä tulee null ?
    public int h = 5;

    public void printMe() {
        System.out.println("leveys : " +w);
        System.out.println("korkeus : " +h);
    }

    public void whoAmI() {
        System.out.println(this);
    }

    public void finalize () {               //kyl se käynnisty
        System.out.println("deleting " +this);
    }

    public int countSurfaceArea() {
        return w*h;
    }

}

class TestRectangle {

        public static void main(String [] args) {
    

            Rectangle p1 = new Rectangle();
            Rectangle p2 = p1;              //<<< kun tämä niin ei roskienpoisto käynnisty. p2 alkaa osoittamaan samaan muistipaikkaan niin roskat ei käynnisty
            System.out.println(p1);
            p1 = null;
            kaynnistaRoskienKeruu();

            //System.out.println(p1);     //null
            //System.out.println(p2);     //mustipaikka
            //p1.printMe();             //ei toimi
            //p2.printMe();               //tulostaa 0 0
            System.out.println(p2.countSurfaceArea());          // <<<<<----- E07

        }


    public static void kaynnistaRoskienKeruu() {
        // Käynnistetään roskien keruu.
        System.gc();
        // Odotellaan sekunnin verran.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}