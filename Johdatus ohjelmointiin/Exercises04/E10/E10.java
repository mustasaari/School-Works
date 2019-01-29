import java.util.*;

public class E10 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

        System.out.println("Anna aakkosen numero : ");
        int numero = syote.nextInt();
        syote.nextLine();               //Enteri poissss

        String [] aakkoset = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 0; i < aakkoset.length; i++) {

            if (i + 1 == numero) {
                System.out.print("\"" +aakkoset[i] +"\"");
            }
            else {
                System.out.print(aakkoset[i]);
            }
        }

    }
}