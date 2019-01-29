import java.util.*;

public class Ykstoist {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

int luku;
    
        do {
            System.out.println("Anna pisteet 0-60 : ");
            luku = syote.nextInt();
        } while (luku < 0 || luku > 60);

        if (luku >= 0 && luku <= 8){
            System.out.println("improbatur");
        }
        else if (luku >= 9 && luku <= 16) {
            System.out.println("approbatur");
        }
        else if (luku >= 17 && luku <= 24) {
            System.out.println("lubenter");
        }
        else if (luku >= 25 && luku <= 35) {
            System.out.println("cum laude");
        }
        else if (luku >= 36 && luku <= 44) {
            System.out.println("magna");
        }
        else if (luku >= 45 && luku <= 52) {
            System.out.println("eximia");
        }
        else {
            System.out.println("laudatur");
        }


    }
}