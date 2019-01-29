
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static String doStuff(int n, String merkit) {

        String returnString = "";

        for (int i = 0; i < n; i++) {
            returnString += merkit;
        }

        return returnString;
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}