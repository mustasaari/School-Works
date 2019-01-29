import java.util.*;

class E07 {
    public static void main(String [] args) {

        Scanner syote = new Scanner(System.in);
        int arvosana;

        do {
            System.out.println("Arvosana : ");
            arvosana = syote.nextInt();
        } while (tarkista(arvosana) == false);
        System.out.println("Annoit arvosanan " +arvosana);
    }

    public static boolean tarkista(int arvosana) {
        if (arvosana >= 4 && arvosana <= 10) {
            return true;
        }
        else {
            return false;
        }
    }

}