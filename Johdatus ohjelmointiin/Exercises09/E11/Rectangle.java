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
            Scanner syote = new Scanner(System.in);
            System.out.println("Nyt pitaa 10 suorakaidetta : ");
            int muuttuja;
            int muuttuja2;
            Rectangle[] taulukko = new Rectangle [10];
            for (int i = 0; i < taulukko.length; i++) {

                try {                                                                      // <<--- try alku

                    //taulukko[i] = new Rectangle();
                    System.out.println("\nKuution " +(i+1) +" leveys ");
                    muuttuja = syote.nextInt();
                    //taulukko[i].setWidth(muuttuja);
                    System.out.println("Kuution " +(i+1) +" korkeus ");
                    muuttuja2 = syote.nextInt();
                    taulukko[i] = new Rectangle(muuttuja, muuttuja2);       // <<<<<<<<<<
                    //taulukko[i].setHeigth(muuttuja);
                    System.out.println("\nvälipintaala : " +taulukko[i].countSurfaceArea());



                } catch(IllegalArgumentException e) {                                       // try loppu
                    System.out.println("virhe!" + e.getMessage());                          // try loppu
                }                                                                           // try loppu

            }

            int summa = 0;
            for (int i = 0; i < taulukko.length; i++) {
                summa += taulukko[i].countSurfaceArea();
            }
            System.out.println("Pinta-alojen summa on : " +summa);

            //Rectangle p1 = new Rectangle();
            //Rectangle p2 = new Rectangle();
            //System.out.println(p1);
            //kaynnistaRoskienKeruu();

            //p1.setHeigth(8);
            //System.out.println(p1.countSurfaceArea());
            //System.out.println(p2.countSurfaceArea());          // <<<<<----- E07

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