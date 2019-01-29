import java.util.*;

class E15 {
    public static void main(String [] args) {
        //Scanner syote = new Scanner(System.in);
        System.out.println (getRandom ( 2, 715));
    }

    public static int getRandom(int min, int max) {     // random metodi alkaa
        double palaute;
        do {
        palaute = Math.random()*max +1;     
        } while (palaute < min);
        //System.out.println((int) palaute);
        return (int)palaute;
    }                                                   // random metodi loppuu
}