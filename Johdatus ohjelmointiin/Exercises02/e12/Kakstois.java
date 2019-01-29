import java.util.*;

public class Kakstois {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int luku;
    
        System.out.print("Pituus : ");
        luku = syote.nextInt();

        do {
            System.out.print("X");
            luku--;
        } while (luku > 0);

    }
}