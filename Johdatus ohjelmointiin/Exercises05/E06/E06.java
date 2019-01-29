import java.util.*;

class E06 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println("Eka luku : ");
        int luku1 = syote.nextInt();
        System.out.println("Toka luku : ");
        int luku2 = syote.nextInt();
        System.out.println("Tulos on : " +laske(luku1, luku2) );
    }

    public static int laske(int luku1, int luku2) {
        int tulos = luku1 + luku2;
        return tulos;
    }
}