
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("gief number : ");
        int syoteInt = sc.nextInt();

        String str = Util.doStuff(syoteInt);

        Util.printStuff(str);

    }
}