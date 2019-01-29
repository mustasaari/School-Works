import java.util.*;

class E08 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        metodi ('X',7);
    }

    public static void metodi(char merkki, int luku) {
        for (int i = 0; i < luku; i++) {
            System.out.print(merkki);
        }
    }
}