
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

        System.out.println("H:n tulostaja. Anna korkeus : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Util.doStuff(number, "Y");

    }
}