import java.util.*;

class E04 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println("Kerro nimi");
        String nimi = syote.nextLine();
        tulostaJokinNimi(nimi);
    }
    public static void tulostaJokinNimi(String nimi) {
        System.out.println("Metodista " +nimi);
    }
}