
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static int doStuff(String a) {

        int wordCount = 0;

        if (a.charAt(0) != ' ') { //ennen ekaa kirjainta ei ole välilyöntiä
            wordCount++;
        }

        for (int i = 0; i < a.length() -1; i++ ) {  //onko välilyönti+merkki yhdistelmiä
            
            if (a.charAt(i) == ' ' && a.charAt(i+1) != ' ' ) {
                wordCount++;
            }

        }

        return wordCount;
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}