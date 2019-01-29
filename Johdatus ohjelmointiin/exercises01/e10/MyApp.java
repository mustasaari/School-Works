
import java.util.Scanner;


public class MyApp {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        System.out.println("Anna eka luku :");
        int luku = syote.nextInt();
        System.out.println("Anna eka luku :");
        int luku2 = syote.nextInt();
        if (luku > luku2 ) System.out.println("Hellurei");

        System.out.println("Summa on : ");
        System.out.println(luku + luku2);

    }
}