import java.util.*;

public class E01 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        String nimi = "";
    
        System.out.print("Anna nimi : ");
        nimi = syote.nextLine();
        //System.out.println(nimi);
        
        if(nimi.equals ("Jussi")) {
            System.out.println("Tyhma nimi");
        }
        else {
            System.out.println("Hieno nimi");
        }
     
    }
}