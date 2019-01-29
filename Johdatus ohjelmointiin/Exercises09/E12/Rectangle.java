import java.util.*;



class Rectangle {
    public int w = 0;                          
    public int h = 0;

    public Rectangle( int a, int b) {                           // Konstruktori <<--- E11
        if (a >= 0 && b >= 0) {
            w = a;
            h = b;
        }
        else {
            IllegalArgumentException e = new IllegalArgumentException("Give positive values");
            throw e;
        }

    }

    public void setWidth(int a) {
        if (a >= 0) {
            w = a;
        }
        else {
            IllegalArgumentException e = new IllegalArgumentException("Give positive values");
            throw e;
        }
    }

    public void setHeigth(int a) {
        if (a >= 0) {
            h = a;
        }
        else {
            IllegalArgumentException e = new IllegalArgumentException("Give positive values");
            throw e;
        }
    }

    public void printMe() {
        System.out.println("leveys : " +w);
        System.out.println("korkeus : " +h);
    }

    public void whoAmI() {
        System.out.println(this);
    }

    public void finalize () {               
        System.out.println("deleting " +this);
    }

    public int countSurfaceArea() {
        return w*h;
    }

}

class TestRectangle {

        public static void main(String [] args) {

            
            Rectangle r1 = new Rectangle(50,50);
            Rectangle r2 = new Rectangle(50,50);
            System.out.println(r1);                 // <<--- todistusaineisto       Rectangle@15db9742
            System.out.println(r2);                 // <<--- ja                     Rectangle@6d06d69c


            if(r1 == r2) {
                System.out.println("Ollaanko iffissa?");        // no ei olla. muistipaikat on eri
            }

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