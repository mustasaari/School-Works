
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String string1 = "";
        int[] sortedArray;

        string1 = Util.readFile();
        sortedArray = Util.doStuff(string1);

        System.out.print("Anna numero mita taulusta haetaan : ");
        int newInt = sc.nextInt();
        Util.doStuff2(sortedArray, newInt);

    }
}