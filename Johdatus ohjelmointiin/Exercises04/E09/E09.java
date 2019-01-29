import java.util.*;

public class E09 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        System.out.println("Nimien lukumaara : ");
        int koko = syote.nextInt();
        syote.nextLine();               //Enteri poissss

        String nimi = "";
        String isoinnimi = "";
        String [] taulukko;
        taulukko = new String[koko];

        System.out.println("taulukon koko on : " +taulukko.length);

        for (int i = 0; i < taulukko.length; i++ ) {
            taulukko[i] = syote.nextLine();
        }

        System.out.println("------------");

        for (int i = 0; i < taulukko.length; i++) {
            //System.out.println(taulukko[i]);

            nimi = taulukko[i];
                if (nimi.length() > isoinnimi.length())
                    isoinnimi = nimi;

        }
        System.out.println("Isoin nimi oli : " +isoinnimi);

    }
}