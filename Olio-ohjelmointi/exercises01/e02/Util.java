
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static String doStuff(int a) {
        String retuString = "";
        //ekat rivit
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < i; j++) {
                retuString += " ";
            }
            retuString += "*\n";
        }

        return retuString;
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}