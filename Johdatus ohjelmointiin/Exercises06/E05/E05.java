import java.util.*;


    class E05 {
        public static void main(String [] args) {

         // Tulostaa true
        System.out.println( StringHelper.contains("koirarotu", "raro") );

         // Tulostaa false
        System.out.println( StringHelper.contains("koirarotu", "tampio") );

        }
    }

    class StringHelper {

        public static String contains(String a, String b) {

            String verrokki = "";

            for (int i = 0; i < a.length(); i++) {
                verrokki = "";

                for (int j = 0; j < b.length(); j++) {
                    if (a.length() > j+i ) {          // <<<<<< estää out of rangen
                        verrokki += a.charAt(i+j);      //tehdään vertailusanoja jotka yhtä pitikiä kuin b-sana
                    }
                    else {
                        return "False";
                    }

                }
                //System.out.println(verrokki);     //debug
                if (verrokki.equals(b)) {           //verrataan verrokkia lyhyempään sanaan
                    return "True";
                }

            }

            return "False";

        }

    }