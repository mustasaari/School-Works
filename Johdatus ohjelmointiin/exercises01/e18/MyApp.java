
import java.util.Scanner;

public class MyApp {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int luku = 1;
        int suurinluku = 0;

        while (luku >= 0)
        {
            System.out.println("Anna luku kunnes negatiivinen");
            luku = syote.nextInt();
            if (luku > suurinluku){
                suurinluku = luku;
            }
        }
        System.out.println("Suurin luku : " +suurinluku);


    }
}