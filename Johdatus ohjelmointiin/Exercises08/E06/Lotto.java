
import java.util.Arrays;
import java.math.BigDecimal;

/**
 * Lotto - luokan avulla voidaan simuloida lottokierrosta.
 *
 * @author Jussi Pohjolainen
 * @author Olli Opiskelija
 * @version 2017.1008
 */
public class Lotto {
    
    /**
    * Pelaajan lottorivi.
    */
    private static int [] pelaajanRivi;
    
    /**
    * Arvottu lottorivi.
    */
    private static int [] lottoRivi;
    
    /**
    * Rahamäärä joka on mennyt lottoamiseen.
    */
    private static double rahamaara = 0;
    
    /**
    * Viikkojen määrä joka on mennyt lottoamiseen.
    */
    private static int viikot = 0;
    
    
    /**
    * Palauttaa parametrina saadun kokonaislukutaulukon 
    * merkkijonomuodossa.
    *
    * Metodi palauttaa parametrina saadun kokonaislukutaulukon
    * merkkijonomuodossa siten, että kukin alkio on eroteltu "|"-
    * merkillä. Tämän lisäksi jos alkion arvo < 10, asetetaan alkion
    * eteen 0. Jos siis parametrina saadaan taulukko {1,10,22}, metodi
    * palauttaa 01 | 10 | 22.
    *
    * @param t kokonaislukutaulukko, joka muutetaan merkkijonoksi.
    * @return merkkijonona saatu kokonaislukutaulukko.
    */
    private static String palautaTaulukko(int [] t) {
        // Aakkostaa taulukon.
        Arrays.sort(t);

        String palautus = "";
        
        for (int i = 0; i < t.length; i++) {
            palautus += t[i];           //lisätään i palautukseen
            if (i < t.length -1) {      //if estää viivan viimeisen numeron jälkeen
                palautus += " | ";
            }
        }
        // Koodi tänne

        return palautus;
    }
    
    /**
    * Lottorivin ostaminen.
    * 
    * Metodi kasvattaa "rahamaara"-muuttujaa eurolla. Tämän lisäksi
    * metodi asettaa saamansa parametrin pelaajanRivi - arvoksi.
    *
    * @param rivi pelaajan lottorivi. Kokonaislukutaulukko (7 alkiota).
    */
    public static void ostaRivi( int [] rivi ) {
        pelaajanRivi = rivi;
        rahamaara++;
    }
    
    
    /**
    * Palauttaa arvotun lottorivin merkkijonomuodossa.
    * 
    * Metodi palauttaa arvotun lottorivin 
 
    * "01 | 03 | 08 | 10 | 12 | 14 | 17". Jos lottonumero < 10
    * sen eteen laitetaan 0. Lottorivi palautetaan suuruusjärjestyksessä.
    * Käyttää hyväkseen metodia palautaTaulukko(..);
    *
    * @return palautettava arvottu lottorivi.
    */
    public static String palautaArvottuRivi() {
        String palautus = "";
        palautaTaulukko(lottoRivi);
        for(int i = 0; i < lottoRivi.length; i++) {
            if (lottoRivi[i] < 10) {
                palautus += "0";
            }
            palautus += lottoRivi[i];
            if (i < lottoRivi.length -1) {
                palautus += " | ";
            }
        }
        
        // koodi tänne
        
        return palautus;
    }

    /**
    * Palauttaa pelaajan rivin merkkijonomuodossa
    * 
    * Metodi palauttaa pelaajan lottorivin muodossa 
    * "01 | 03 | 08 | 10 | 12 | 14 | 17". Jos pelaajan lottonumero < 10
    * sen eteen laitetaan 0. Pelaajan lottorivi palautetaan
    * suuruusjärjestyksessä.
    * Käyttää hyväkseen metodia palautaTaulukko(...)
    *
    * @return palautettava pelaajan lottorivi.
    */    
    public static String palautaPelaajanRivi() {
        String palautus = "";
        palautaTaulukko(pelaajanRivi);
        for(int i = 0; i < pelaajanRivi.length; i++) {
            if (pelaajanRivi[i] < 10) {
                palautus += "0";
            }
            palautus += pelaajanRivi[i];
            if (i < pelaajanRivi.length -1) {
                palautus += " | ";
            }
        }
        
        // koodi tänne
        
        return palautus;
    }
    
    /**
    * Palauttaa pelatun rahamäärän pyöristettynä kahden desimaalin
    * tarkkuudella. Käyttää hyväkseen round(...) metodia.
    *
    * @return pelattu rahamäärä pyöristettynä kahden desimaalin tarkkuudella.
    */
    public static double palautaRahamaara() {
        //double palautus = 0.0;
         
        double pyoristettynä = round(rahamaara);
        return pyoristettynä;
        
        //return palautus;
    }
    
    /**
    * Apumetodi lottorivin arpomiseen. 
    *
    * Metodi tarkistaa löytyykö parametrina saatu arvottu luku
    * lottorivistä. Jos siis arvottu lottorivi on {2,8,12,24,30,31,32}
    * ja parametri arvottu on 2, metodi palauttaa false (löytyy lottorivistä).
    * Jos taas parametri on 3, metodi palauttaa true (ei löydy lottorivistä).
    *
    * @return false jos parametrina saatu arvottu arvo löytyy lottorivista. Jos
    *         ei löydy, palautetaan true.
    **/
    private static boolean onkoNumeroOk(int arvottu) {
        boolean palautus = true;

        // koodi tänne
        
        return palautus;
    }
    
    /**
    * Palauttaa vuosien määrän joka on mennyt lottoamiseen
    * (viikot / 52).
    *
    * Metodi palauttaa liukulukuna vuosien määrän, joka on
    * mennyt lottoamiseen. Vuosien määrä esitetään pyöristettynä
    * kahden desimaalin tarkkuudella. Metodi käyttää hyväkseen
    * round-metodia.
    *
    * @return vuosien määrä joka on mennyt lottoamiseen kahden desimaalin
    * tarkkuudella.
    */
    public static double palautaVuosienMaara() {
        double palautus = 0.0;
        
        // koodi tänne
        
        return palautus;
    }
    
    /**
    * Pelikierroksen pelaaminen.
    *
    * Metodi alustaa (=luo) tietojäsenenä olevan lottoRivi - muuttujan 
    * (7 kokonaislukua)
    * ja arpoo taulukkoon seitsemän arvoa väliltä 1-40. Lottorivi ei voi
    * sisältää kahta tai useampaa samaa lottonumeroa. Metodi käyttää
    * hyväkseen apumetodia onkoNumeroOk(int arvottu). Metodi myös
    * kasvattaa viikkomäärää (tietojäsen viikot).
    */
    public static void peliKierros() {
        // luo taulukon
        lottoRivi = new int[7];

        // koodi tänne
        viikot++;
        for (int i = 0; i < lottoRivi.length; i++) {
            int arvottu = (int) (Math.random() * 40 + 1);
            lottoRivi[i] = arvottu;
        }
    }
    
    /**
    * Metodi palauttaa tiedon siitä kuinka monta lottonumeroa
    * pelaajalla meni oikein. 
    *
    * Metodi vertaa pelaajanRiviä lottoRiviin ja palauttaa
    * tiedon kuinka monta numeroa pelaajalla meni oikein.
    *
    * @return määrä joka pelaajalla meni lotossa oikein (0-7)
    */
    public static int kerroTulos() {
        int maara = 0;

        // koodi tänne
        
        return maara;
    }
    
    /**
    * Pyöristää saamansa liukuluvun kahden desimaalin tarkkuudella.
    *
    * @param value arvo joka pyöristetään
    * @return arvo pyöristettynä kahden desimaalin tarkkuudella.
    */
    private static double round(double value) {
        // tänne ei tarvitse tehdä muutoksia.
        BigDecimal bd = new BigDecimal(Double.toString(value));

        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}