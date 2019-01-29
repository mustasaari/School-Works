
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static float doStuff(int a, int b) {

        float bmi = (float)a/100f;
        bmi = bmi * bmi;
        bmi = (float)b/bmi;

        return bmi;

    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}