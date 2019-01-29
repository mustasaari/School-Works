
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static int[] doStuff(int [] taulukko) {

        int[] newArray;
        newArray = new int[(taulukko.length +1) /2];

        for (int i =0; i < newArray.length; i++) {
            newArray[i] = taulukko[i*2];
        }

        return newArray;
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}