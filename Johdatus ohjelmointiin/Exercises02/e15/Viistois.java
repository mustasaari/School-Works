import java.util.*;

public class Viistois {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        int leveys;
    
        System.out.print("Leveys : ");
        leveys = syote.nextInt();

        for (int i = leveys; i > 0; i--) {


            for (int j = leveys; j > 0; j--){
                
                if ( i == j ) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println(""); //rivinvaihto


        }


    }
}