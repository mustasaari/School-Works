import java.util.*;

public class Kasi {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

    int vastaus = 0;

    System.out.println("Anna eka luku : ");
    int ekaluku = syote.nextInt();
    System.out.println("Anna toka luku :");
    int tokaluku = syote.nextInt();

        do {
            tokaluku--;
            vastaus = vastaus + ekaluku;
        } while (tokaluku != 0);

    System.out.println("Vastaus on :");
    System.out.println(vastaus);


    

    
    }
}