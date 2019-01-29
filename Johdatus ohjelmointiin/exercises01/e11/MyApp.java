
import java.util.Scanner;


public class MyApp {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        System.out.println("Anna eka luku :");
        int luku = syote.nextInt();
        System.out.println("Anna toka luku :");
        int luku2 = syote.nextInt();
        System.out.println("Suurempi luku on :");
        if (luku > luku2 ) System.out.println(luku);
        if (luku < luku2) System.out.println(luku2);

    }
}