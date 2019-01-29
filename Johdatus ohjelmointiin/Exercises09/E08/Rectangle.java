import java.util.*;



class Rectangle {
    public int w = 1;                           // <<--- intissä tästä tulee null ?
    public int h = 1;

    public void setWidth(int a) {
        w = a;
    }

    public void setHeigth(int a) {
        h = a;
    }

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
            Scanner syote = new Scanner(System.in);
            System.out.println("Nyt pitaa 10 suorakaidetta : ");
            int muuttuja;
            Rectangle[] taulukko = new Rectangle [10];
            for (int i = 0; i < taulukko.length; i++) {
                taulukko[i] = new Rectangle();
                System.out.println("Kuution " +i +" leveys ");
                muuttuja = syote.nextInt();
                taulukko[i].setWidth(muuttuja);
                System.out.println("Kuution " +i +" korkeus ");
                muuttuja = syote.nextInt();
                taulukko[i].setHeigth(muuttuja);
                System.out.println("pintaala : " +taulukko[i].countSurfaceArea());
            }

            Rectangle p1 = new Rectangle();
            Rectangle p2 = new Rectangle();
            System.out.println(p1);
            kaynnistaRoskienKeruu();

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