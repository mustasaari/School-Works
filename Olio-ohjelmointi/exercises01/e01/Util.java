
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static String doStuff(int a) {
        String retuString = "";
        //ekat rivit
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < a; j++) {
                retuString += " ";
            }
            retuString += "*\n";
        }
        //vika tulosterivi
        for (int i = 0; i < a; i++) {
            retuString += "*";
        }
        return retuString;
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}