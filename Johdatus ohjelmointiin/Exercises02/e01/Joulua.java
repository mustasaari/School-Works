import java.util.*;

public class Joulua {
    public static void main(String [] args){
        Scanner syote = new Scanner(System.in);

        System.out.println("paiva :");
        int paiva = syote.nextInt();
        System.out.println("kuukausi :");
        int kuukausi = syote.nextInt();

        if ( paiva == 24 && kuukausi == 12) {
            System.out.println("Hauskaa Joulua");
        }
        else System.out.println("-----");

    

    }
}