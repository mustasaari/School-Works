import java.util.*;

/** Luokka merkkien ja merkkijonojen muokkaamiseen
*
*
*   @author Mikko Mustasaari
*
*   @version 2017.1010
*
*   @since 1.4 
*/

public class StringHelper {

    /**
    * Metodi muuttaa merkkeja sisaltavan taulukon merkkijonoksi
    *
    * @param merkkitaulukko merkkeja sisältävä taulukko
    *
    * @return palaute palauttaa merkkijonon
    */

    public static String toString(char [] merkkitaulukko) {
        String palaute = "";
        for (int i = 0; i < merkkitaulukko.length; i++) {
            palaute += merkkitaulukko[i];
        }
        return palaute;
    }

}