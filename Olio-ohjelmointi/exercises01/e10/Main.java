
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);
    String string1;

        do {

            System.out.print("Anna lause tai lopeta : ");
            string1 = sc.nextLine();
            System.out.println("Sanoja on : " +Util.doStuff(string1));

        } while (!string1.equals("lopeta"));

    }
}