import java.util.*;

public class E08 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        
        int summa = 0;
        int [] taulukko;
        taulukko = new int[10];
        System.out.println("10 lukua pliis : ");
            for (int i = 0; i < taulukko.length; i++) {
            taulukko[i] = syote.nextInt();
        }

        for (int i = 0; i < taulukko.length; i++) {
            summa += taulukko[i];
        }

        System.out.println("Summa oli : " +summa);

    }
}