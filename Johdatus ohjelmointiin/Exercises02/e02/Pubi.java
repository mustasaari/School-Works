import java.util.*;

public class Pubi {
    public static void main(String [] args){
        Scanner syote = new Scanner(System.in);

        System.out.println("rahat :");
        int rahat = syote.nextInt();
        System.out.println("kello 24h :");
        int kello = syote.nextInt();

        if (rahat > 50 && kello > 12) {
            System.out.println("Pubiin -->");
        }
        else System.out.println("Ei pubiin");

    

    }
}