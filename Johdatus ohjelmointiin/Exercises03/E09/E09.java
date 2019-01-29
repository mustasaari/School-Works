import java.util.*;

public class E09 {
    public static void main(String [] args) {

            Scanner syote = new Scanner(System.in);
            String sana;
            String siivottusana = "";
            String sana2 = "";
            char kirjain;
            int sananpituus;

            System.out.print("Palindromitesti : ");
            sana = syote.nextLine();
            sananpituus = sana.length();

            for (int i = 0; i < sananpituus; i++) { //merkinpoistaja
                kirjain = sana.charAt(i);
                //System.out.println(kirjain);
                if (kirjain != ',' && kirjain != '.' && kirjain != ' ') {
                siivottusana += kirjain;
                }

            }
            sananpituus = siivottusana.length();

             //Sanankääntäjä
            for (int i = sananpituus; i > 0; i--) {
                sana2 += siivottusana.charAt(i-1);
            }

            System.out.println("sana ennen " +sana);
            System.out.println("siivottuna : " +siivottusana);
            System.out.println("Kaannettyna : " + sana2);
            if (siivottusana.equals(sana2)) {       //verrataan sanat
                System.out.println("Palindromi!!!");
            }

    }
}