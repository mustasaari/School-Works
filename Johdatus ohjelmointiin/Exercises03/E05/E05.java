import java.util.*;

public class E05 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        String nimi = "";
    
        System.out.print("Anna nimi : ");
        nimi = syote.nextLine();
        //System.out.println(nimi);
        int rivi = nimi.length();

        for (int i = rivi; i > 0; i-- ) {           //käänteinen for (int i = 0; i < rivi; i++ ) 
           System.out.println(nimi.charAt(i-1));    // - pois
           i--;                                     // i++
        }
     
    }
}