import java.util.*;

class E13 {
    public static void main(String [] args) {
        String palindromi;
        Scanner syote = new Scanner(System.in);
        palindromi = syote.nextLine();
        if (isPalindrome(palindromi) == true) {
            System.out.println("Oli se palindromi");
        }
        else {
            System.out.println("Ei tainnut olla palindromi");
        }
    }


    static boolean isPalindrome(String original) { //Palauttaa tiedon onko annettu sana palindromi vai ei bool
        String palindromi2 = "";
        for (int i = original.length() -1; i >= 0; i-- ) {
            palindromi2 += original.charAt(i);
        }
        //System.out.println(original);
        //System.out.println(palindromi2);      //vikatarkistus
        if (original.equals(palindromi2)) {
            return true;
        }
        else {
            return false;
        }
    }

}