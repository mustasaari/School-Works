import java.util.*;

public class Ysitoi {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int pelaaja1;
        int pisteet1 = 0;
        int pisteet2 = 0;
    
        for (int i = 0; i <= 2; i++) {

            System.out.println("Pelaaja 1 pisteet : " +pisteet1);
            System.out.println("Palaaja 2 pisteet : " +pisteet2);

            System.out.println("Player One - 1. Kivi  2. Paperi  3. Sakset");
            pelaaja1 = syote.nextInt();

            System.out.println("Player Two - 1. Kivi  2. Paperi  3. Sakset");
            double pelaaja2 = Math.random()*3 + 1;
            System.out.println((int) pelaaja2);

            if (pelaaja1 ==(int) pelaaja2) {
            System.out.println("Tasapeli!");
            }
            else if ((pelaaja1 == 1 &&(int) pelaaja2 == 3) || (pelaaja1 == 2 &&(int) pelaaja2 == 1) || (pelaaja1 == 3 && (int) pelaaja2 == 2)) {
            System.out.println("Pelaaja 1 voittaa!");
            pisteet1++;
            }
            else {
            System.out.println("Pelaaja 2 voittaa!");
            pisteet2++;
            }

        }

        if (pisteet1 > pisteet2){
            System.out.print("PELAAJA 1 ON VOITTAJA!!!");
        }
        else if(pisteet1 < pisteet2) {
            System.out.print("PELAAJA 2 ON VOITTAJA!!!");
        }
        else {
            System.out.println("TASAPELI");
        }
    }
}