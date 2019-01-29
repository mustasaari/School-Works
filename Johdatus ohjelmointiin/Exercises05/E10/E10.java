import java.util.*;

class E10 {
    public static void main(String [] args) {
        int koko;
        Scanner syote = new Scanner(System.in);
        System.out.println("Isoko nelio laitetaan : ");
        koko = syote.nextInt();
        metodi ('X',koko);
    }

    public static void metodi(char merkki, int luku) {
        for (int j = 0; j < luku; j++) {
            for (int i = 0; i < luku; i++) {
                System.out.print(merkki);
            
            } 
            System.out.println(""); //rivinvaihtoi vain  
        }
    }
}