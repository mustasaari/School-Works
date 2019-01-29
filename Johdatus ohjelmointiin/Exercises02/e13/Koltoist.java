import java.util.*;

public class Koltoist {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int leveys;
        int korkeus;
        int vleveys;
    
        System.out.print("Leveys : ");
        leveys = syote.nextInt();
        System.out.print("Korkeus : ");
        korkeus = syote.nextInt();

        while (korkeus > 0) {

            System.out.println("");
            vleveys = leveys;

                while (vleveys > 0) {
                    System.out.print("X");
                    vleveys--;
                }

            korkeus--;
        }

    }
}