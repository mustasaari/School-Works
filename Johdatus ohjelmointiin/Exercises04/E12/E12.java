import java.util.*;

public class E12 {
    public static void main(String [] args) {
        //Scanner syote = new Scanner(System.in);


        double luku2 = Math.random()*3+1;
        int luku = (int)luku2;
        while (luku == 1) {
            System.out.println("kivi");
            luku = 4;
        }
        while (luku == 2) {
            System.out.println("paperi");
            luku = 4;
        }
        while (luku == 3) {
            System.out.println("sakset");
            luku = 4;
        }

        //int luku2 = (int)luku;
       // System.out.println(luku2);

    }
}