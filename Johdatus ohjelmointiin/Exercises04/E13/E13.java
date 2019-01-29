import java.util.*;

public class E13 {
    public static void main(String [] args) {
    
    

    if (args.length == 3) {

        int tulos = 0;
        String toimi = args[1];
        int luku1 = Integer.parseInt(args[0]);
        int luku2 = Integer.parseInt(args[2]);


        if (toimi.equals("x")) {
            tulos = luku1*luku2;
            System.out.println("Tulos : " +tulos);
        }
        else if (toimi.equals("+")) {
            tulos = luku1 + luku2;
            System.out.println("Tulos : " +tulos);
        }
        else if (toimi.equals("-")) {
            tulos = luku1-luku2;
            System.out.println("Tulos : " +tulos);
        }
        else if (toimi.equals("/")) {
            double tulos2 = (double)luku1 / (double)luku2;
            System.out.println("Tulos : " +tulos2);
        }
        else {
            System.out.println("Jotain vikaa on ");
        }

    }
    else {
        System.out.println("Ei toimi. Anna parametreja");
    }


 

    }
}