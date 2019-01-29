import java.util.*;


    class E04 {
        public static void main(String [] args) {
             System.out.println( tulosta('x', itseisarvo(-3)) );
             System.out.println( tulosta('a', itseisarvo(4))  );

        }

        public static String tulosta(char merkki, int arvo) {
            String retu = "";
            for (int i = 0; i < arvo; i++) {
                retu += merkki;
            }
            return retu;
        }

        public static int itseisarvo(int arvo) {
            if (arvo < 0) {
                arvo = arvo * -1 ;
            }
            return arvo;
        }
    }