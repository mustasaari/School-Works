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

    public boolean equals(Rectangle jee) {                              // <<< --- E13
            if ( w == jee.getWidth() && h == jee.getHeigth()) {
                return true;
            }
        return false;
    }

    public int getWidth() {                             // <<<<< e13 get
        return w;
    }
    public int getHeigth() {
        return h;
    }

    public String toString() {                      // <<<<<<< e14
        String merkkijono = "";
        merkkijono += "Width is ";
        merkkijono += Integer.toString(w);
        merkkijono += " and Heigth is ";
        merkkijono += Integer.toString(h);
        return merkkijono;
    }

    public double countDiagonal() {                 // E15
        double tulos; 
        tulos = (w * w) + (h * h);
        tulos = Math.sqrt(tulos);
        return tulos;
    }

    public Rectangle cloneMe () {                   //E16
        Rectangle uusiRectangle = new Rectangle(w,h);
        return uusiRectangle; 
    }

}

class TestRectangle {

        public static void main(String [] args) {

            
            Rectangle r1 = new Rectangle(30,50);            //E16 CloneMe
            Rectangle r2 = r1.cloneMe();                    //E16 CloneMe


            if(r1 != r2) {          //Kayttoesimerkit
                System.out.println("different memory addresses");
            }

            if(r1.equals(r2)) {
                System.out.println("The same width and height");
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