import java.util.*;

public class E10 {
    public static void main(String [] args) {

        String merkkijono = "";
        int pituus;
        int summa = 0;
        int summattava = 0;
        String valiluku = "";
        char merkki;

            Scanner syote = new Scanner(System.in);
            System.out.println("Anna lukuja : ");
            merkkijono = syote.nextLine();

            pituus = merkkijono.length();

            for ( int i = 0; i < pituus ; i++ ) {
                merkki = merkkijono.charAt(i);      //scannataan jonon seuraava merkki

                if (merkki != ',') {                //jos ei pilkku niin lisätään merkki välimuuttujaan
                    valiluku += merkki;
                }
                if (merkki == ',') {                //jos pilkku niin lisätään välimuuttuja summaan
                    //System.out.println(valiluku);
                    summattava = Integer.parseInt(valiluku);    //Stringi Intiksi
                    summa += summattava;
                    valiluku = "";
                    summattava = 0;
                }
            }
            summattava = Integer.parseInt(valiluku);    //vielä nämä kun ei pilkkua lopussa
            summa += summattava;

            System.out.println("Summa on : " +summa);
    }
}