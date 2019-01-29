import java.util.*;

public class Kymppi {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

int luku;
    
        do {
            System.out.println("Anna numero 1-7 : ");
            luku = syote.nextInt();
        } while (luku < 1 || luku > 7);

        switch (luku) {
            case 1: System.out.println("Maanantai"); break;
            case 2: System.out.println("Tiistai"); break;
            case 3: System.out.println("Keskiviikko"); break;
            case 4: System.out.println("Torstai"); break;
            case 5: System.out.println("Perjantai"); break;
            case 6: System.out.println("Lauantai"); break;
            case 7: System.out.println("Sunnuntai"); break;
        }


    }
}