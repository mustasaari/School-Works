import java.util.*;

public class E08 {
    public static void main(String [] args) {

            Scanner syote = new Scanner(System.in);
            String sana;
            String sana2 = "";
            int sananpituus;

            System.out.print("Palindromitesti : ");
            sana = syote.nextLine();

            sananpituus = sana.length();    //Sanankääntäjä
            for (int i = sananpituus; i > 0; i--) {
                //System.out.println("Loop");
                sana2 += sana.charAt(i-1);
            }

            System.out.println(sana2);
            if (sana.equals(sana2)) {       //verrataan sanat
                System.out.println("Palindromi!!!");
            }

    }
}