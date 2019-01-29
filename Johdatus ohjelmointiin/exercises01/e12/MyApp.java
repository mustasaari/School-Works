
import java.util.Scanner;

// tehtava 12

public class MyApp {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        System.out.println("Syota ika :");
        int ika = syote.nextInt();
        if (ika < 25) System.out.println("Oletpas nuori");
        if (ika >= 25) System.out.println("Oletpas vanha");


    }
}