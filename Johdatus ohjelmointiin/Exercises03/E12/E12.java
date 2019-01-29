import java.util.*;

public class E12 {
    public static void main(String [] args) {   //TOIMII VAIN pikkukirjaimilla

        final String vastaus = "dromedaari";    //arvattava sana
        String arvatut = "";                    //kaikki arvatut merkit ovat täällä
        String arvattu = "";                    //mitä juuri äsken arvattiin
        String lopetus = "";                    //for loopissa tänne vastaus
        int pituus;                             // jo arvattujen merkkien määrä
        int pituus2 = vastaus.length();         //arvattavan sanan pituus
        char merkki;                            //merkkivertailuun
        char merkki2;                           //merkkivertailu

        for ( int k = 0; k <= pituus2; k++) {   //tulostaa ekat viivat vaikka ei sitä näin ollut tarkoitettu
            System.out.print("-");              
        }

        do {

            lopetus = "";                                       //tähän muodostetaan  sana loopeissa joku on myös lopetuksen ehto

            Scanner syote = new Scanner(System.in);
            System.out.print("\n\nAnna yksi pieni kirjain : ");
            arvattu = syote.nextLine();

            arvatut += arvattu;                                 // kirjataan kaikki arvatut merkit ylös
            arvattu = "";                                       //nollataan se missä oli viimeksi arvattu merkki

            pituus = arvatut.length();

            for ( int i = 0; i < pituus2 ; i++ ) {              //Valitaan vastaukset merkkejä 0 -> 10
                merkki = vastaus.charAt(i);                     //scannataan vastauksen seuraava merkki

                for ( int j = 0; j < pituus ; j++) {
                    merkki2 = arvatut.charAt(j);
                    if (merkki == merkki2) {                    //jos arvatuissa on käsiteltävä merkki se tulostetaan
                        System.out.print(merkki);
                        lopetus += merkki;
                        j = 10000;                              //ja looppi keskeytetään
                    }
                    if (merkki != merkki2 && j == pituus -1) {         //jos ei kirjainta viimeisessä kierrossa niin - tulostetaan
                        System.out.print("-");
                    }
                }
            }
        } while (!lopetus.equals(vastaus));                     //tarkastetaan loppuuko ohjelma
    }
}