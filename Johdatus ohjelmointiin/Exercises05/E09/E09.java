import java.util.*;

class E09 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println (metodi ('X',7));
    }

    public static String metodi(char merkki, int luku) {
        String palaute ="";
        for (int i = 0; i < luku; i++) {
            palaute += merkki;
        }
        return palaute;
    }
}