import java.util.*;

public class Seitoi {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int pelaaja1;
        int pelaaja2;
    
        System.out.println("Player One - 1. Kivi  2. Paperi  3. Sakset");
        pelaaja1 = syote.nextInt();

        System.out.println("Player Two - 1. Kivi  2. Paperi  3. Sakset");
        pelaaja2 = syote.nextInt();

        if (pelaaja1 == pelaaja2) {
            System.out.println("Tasapeli!");
        }
        else if ((pelaaja1 == 1 && pelaaja2 == 3) || (pelaaja1 == 2 && pelaaja2 == 1) || (pelaaja1 == 3 && pelaaja2 == 2)) {
            System.out.println("Pelaaja 1 voittaa!");
        }
        else {
            System.out.println("Pelaaja 2 voittaa!");
        }
    }
}