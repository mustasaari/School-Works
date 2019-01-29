import java.util.*;

public class E11 {
    public static void main(String [] args) {

        String merkkijono = "";
        int pituus;
        int summa = 0;
        int summattava = 0;
        String valiluku = "";
        char merkki;
        int pienin = 0;
        int isoin = 0;
        int fix = 1;

            Scanner syote = new Scanner(System.in);
            System.out.println("Anna lukuja : ");
            merkkijono = syote.nextLine();

            pituus = merkkijono.length();

            for ( int i = 0; i < pituus ; i++ ) {
                merkki = merkkijono.charAt(i);              //scannataan jonon seuraava merkki

                if (merkki != ',') {                         //jos ei pilkku niin lisätään merkki välimuuttujaan
                    valiluku += merkki;
                }
                if (merkki == ',' || i == pituus-1) {             //jos pilkku niin lisätään välimuuttuja summaan, ynnäys vikalle kerralle
                    summattava = Integer.parseInt(valiluku);    //Stringi Intiksi
                    summa += summattava;
                    valiluku = "";
                    if (fix ==1){
                        isoin = summattava;
                        pienin = summattava;
                        fix = 0;
                    }
                    if (isoin < summattava)
                        isoin = summattava;
                    if (pienin > summattava)
                        pienin = summattava;
                    //summattava = 0;
                }

            }
            System.out.println("Summa on : " +summa);
            System.out.println("Isoin on : " +isoin);
            System.out.println("Pienin on : " +pienin);
            double summa2 =  (double) isoin/(double)  pienin;
            System.out.println("Jako : " +summa2);
    }
}