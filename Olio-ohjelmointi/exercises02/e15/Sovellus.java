import java.awt.Color;
import java.util.Scanner;
import java.util.*;

class Sovellus {
    public static void main(String [] args){
        LinkedList<Color> listaPisteet = new LinkedList<Color>();
        Scanner sc = new Scanner(System.in);
        int rPoint = 0;
        int gPoint = 0;
        int bPoint = 0;

        while ( true ) {
            System.out.println("Input red & 256 to quit");
            rPoint = sc.nextInt();
            if(rPoint >255) break; 
            System.out.println("Input green & 256 to quit");
            gPoint = sc.nextInt();
            if(gPoint >255) break; 
            System.out.println("Input blue & 256 to quit");
            bPoint = sc.nextInt();
            if(bPoint >255) break; 

            if (rPoint < 256 && gPoint < 256 && bPoint < 256) {
                listaPisteet.add(new Color(rPoint, gPoint, bPoint, 255) );
            }

        }

        System.out.println("Sitten tulostellaan");

        for (Color x : listaPisteet) {
            System.out.println(x.toString());
        }

    }

    public static void tulostaPiste(Piste x) {
        System.out.println("metodi joka tulostaa : ");
        x.tulostaArvot();
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

class Piste {
    private int x;      //y has private access in Piste
    private int y;         //private eli pääsee käsiksi vaan luokan sisältä

    public Piste(){
        setX(0);
        setY(0);
    }

    public Piste(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int xPos) {
        if ( xPos >= 0) {
            x = xPos;
        }
        else {
            x = 0;
        }
    }

    public void setY(int yPos) {
        if ( yPos >= 0) {
            y = yPos;
        }
        else {
            y = 0;
        }
    }

    public boolean equals(Piste x) {
        boolean returnValue;
        if (x.getX() == this.x && x.getY() == this.y) {
            returnValue = true;
        }
        else {
            returnValue = false;
        }
        return returnValue;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    void tulostaArvot() {
        System.out.println("X : " +x);
        System.out.println("Y : " +y);
    }

    void kukaMinaOlen() {
        System.out.println(this);  
    }

    protected void finalize() {
        System.out.println("Deleting: " + this);
   }
}