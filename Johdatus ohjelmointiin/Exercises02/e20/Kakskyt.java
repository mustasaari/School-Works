import java.util.*;

public class Kakskyt {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int pelaaja1;
    
        System.out.println("Player One - 1. Kivi  2. Paperi  3. Sakset 4. Lizard 5. Spock");
        pelaaja1 = syote.nextInt();

        System.out.println("Player Two - 1. Kivi  2. Paperi  3. Sakset 4. Lizard 5. Spock");
        double pelaaja2 = Math.random()*5 + 1;
        System.out.println((int) pelaaja2);

        if (pelaaja1 ==(int) pelaaja2) {
            System.out.println("Tasapeli!");    //tähän asti ok
        }
        else if ((pelaaja1 == 1 &&(int) pelaaja2 == 3) || (pelaaja1 == 1 && (int) pelaaja2 == 4) || (pelaaja1 == 2 &&(int) pelaaja2 == 1)|| (pelaaja1 == 2 &&(int) pelaaja2 == 5) || (pelaaja1 == 3 && (int) pelaaja2 == 2)|| (pelaaja1 == 3 && (int) pelaaja2 == 4) || (pelaaja1 == 4 && (int)pelaaja2 ==  5) || (pelaaja1 == 4 && (int)pelaaja2 == 2) ||(pelaaja1 == 5 && (int)pelaaja2 == 1) || (pelaaja1 ==5 && (int)pelaaja2 == 3 ) ) {
            System.out.println("WIN!");
        }
        else {
            System.out.println("LOSE!");
        }
    }
}