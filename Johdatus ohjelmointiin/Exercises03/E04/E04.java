import java.util.*;

public class E04 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        String nimi = "";
    
        System.out.print("Anna nimi : ");
        nimi = syote.nextLine();
        //System.out.println(nimi);
        int rivi = nimi.length();

        for (int i = rivi; i > 0; i--) {
            System.out.println(nimi.charAt(i-1));
        }
     
    }
}