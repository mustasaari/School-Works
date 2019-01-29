import java.util.*;


    class E08 {
        public static void main(String [] args) {

         // Tulostaa true
        System.out.println( StringHelper.contains("koirarotu", "raro") );

         // Tulostaa false
        System.out.println( StringHelper.contains("koirarotu", "tampio") );

        if (StringHelper.equals("koirar","koorar")) {   //tämä if/else E06 tulostus ja testausta varten
            System.out.println("True");                 //
        }                                               //
        else {                                          //
            System.out.println("False");                //
        }                                               //


        String [] taulukko = StringHelper.split("tiina:pekka:kalle", ':');
        System.out.println(taulukko[0]); // tulostaa "tiina"
        System.out.println(taulukko[1]); // tulostaa "pekka"
        System.out.println(taulukko[2]); // tulostaa "kalle"


        }
    }

    class StringHelper {

        public static String contains(String a, String b) {     //E05 juttua

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

         public static boolean equals(String a, String b) {     // varsinainen tehtävä E06
             if (a.length() != b.length()) {                    //jos eri pituiset sanat on false
                 return false;
             }
             for (int i = 0; i < a.length(); i++) {             //jos yksikin kirjain eri niin false
                 if (a.charAt(i) != b.charAt(i)) {
                     return false;
                 }
             }

             return true;
         }

        public static String[] split(String a, char merggi) {       //E08
            int muuttuja = 0;                                   //mitä solua täytetään
            String taulukko[] = new String[3];
            taulukko[0] = "";                                   //poistaa null ekasta solusta :/

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != merggi ) {                       //jos ei pilkku niin lisätään taulukkoon
                    taulukko[muuttuja] += a.charAt(i);
                }
                else {                                          //jos pilkku niin alkaa täyttään seuraavaa solua
                    muuttuja++;
                    taulukko[muuttuja] = "";
                }
            }

            return taulukko;
        } 

    }