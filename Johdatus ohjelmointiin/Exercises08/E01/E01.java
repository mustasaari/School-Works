import java.util.*;

class E01 {
        public static void main(String [] args) {

            char [] taulukko = {'a','c','e','h','k'};

            String merkkijono = StringHelper.toString(taulukko);
            System.out.println(merkkijono);

        }

}


class StringHelper {
    
/** Stringhelper docci alkaa
*
*
*
*/  Stringhelper docci loppuu

    public static String toString(char [] a) {
        String palaute = "";
        for (int i = 0; i < a.length; i++) {
            palaute += a[i];
        }
        return palaute;
    }

}