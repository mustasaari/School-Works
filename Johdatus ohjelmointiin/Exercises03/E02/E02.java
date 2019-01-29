import java.util.*;

public class E02 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        String nimi = "";
    
        System.out.print("Anna nimi : ");
        nimi = syote.nextLine();
        //System.out.println(nimi);
        
        System.out.println("CharAt2 : ");
        System.out.println(nimi.charAt(2));
        System.out.println("Length : ");
        System.out.println(nimi.length());
        System.out.println("Trim : "); //This method returns a copy of the string, with leading and trailing whitespace omitted.
        System.out.println(nimi.trim()); 
     
    }
}