
package fi.tamk.tiko.olioohjelmointi.util;
import java.util.Arrays;

public class Util {

    public static int[] doStuff(String a) {

        int intCount = 0;

        String[] splitted = a.split(",");
        int[] intArray = new int[splitted.length];

        for (int i = 0; i < splitted.length; i++ ) {  //onko välilyönti+merkki yhdistelmiä
            intArray[i] = Integer.parseInt(splitted[i]);
        }
        Arrays.sort(intArray);
        return intArray;
    }

    public static void doStuff2(int[] b, int c) {
        int tulos = 0;

        for (int x: b) {    //print array
            System.out.print(" " +x);
        }
        System.out.println("");

        for (int i = 0; i < b.length; i++ ) {
            if ( b[i] == c ) {
                System.out.println("Numero " +c +" loytyy indeksista " +tulos);
                break;
            }
            if ( i == b.length -1) {
                System.out.println("Ei loydy");
            }
            tulos++;
        }


    }
}