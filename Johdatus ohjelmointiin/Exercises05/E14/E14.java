import java.util.*;

class E14 {
    public static void main(String [] args) {
        String palindromi;
        Scanner syote = new Scanner(System.in);
        System.out.println("Palindromitesti : ");
        palindromi = syote.nextLine();
        if (isPalindrome(palindromi,false) == true) {        //iffissä True poistaa välilyönnit
            System.out.println("Oli se palindromi");
        }
        else {
            System.out.println("Ei tainnut olla palindromi");
        }
    }


    static boolean isPalindrome(String original, boolean whiteSpaceRemove) { //Palauttaa tiedon onko annettu sana palindromi vai ei bool
        String palindromi2 = "";
        String palindromi3 = "";
        if (whiteSpaceRemove == true) {

            for (int i = original.length() -1; i >= 0; i--) {   //tämä looppi poistelee välit ja kääntää sanan
                if (original.charAt(i) != ' ') {            //jos ei ole väli niin lisätään sanaan
                    palindromi2 += original.charAt(i);
                }
                else {
                    palindromi2 += "";
                }
            }

            for (int i = 0; i <= original.length() -1; i++) {   //tämä looppi poistaa välit original sanasta
                if (original.charAt(i) != ' ') {        
                    palindromi3 += original.charAt(i);
                }
                else {
                    palindromi3 += "";
                }
            }
            
        }
        
        else {          //tässä loopissa ei whitespacen poistoa
            for (int i = original.length() -1; i >= 0; i-- ) {
                    palindromi2 += original.charAt(i);
                    palindromi3 = original;
            }
        }

        //System.out.println(palindromi2);      //vikatarkistus
        //System.out.println(palindromi3);      //vikatarkistus
        if (palindromi3.equals(palindromi2)) {  //jos sanat mätsää palautetaan true
            return true;
        }
        else {                                  //jos sanat ei mätsää palautetaan false
            return false;
        }
    }

}