import java.util.*;

public class E07 {
    public static void main(String [] args) {

            Scanner syote = new Scanner(System.in);
            String nimi;
            String nimet = "";
        do {
            System.out.print("Nimi tai Lopeta : ");
            nimi = syote.nextLine();
            nimet += nimi;
            //nimet += " "; //välilyönti nimien väliin
            System.out.println(nimet);
        } while (!nimi.equals ("Lopeta"));

    }
}