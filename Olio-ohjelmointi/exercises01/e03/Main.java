
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("gief height : ");
        int h = sc.nextInt();
        System.out.print("gief weight : ");
        int w = sc.nextInt();

        System.out.println ("BMI : " +Util.doStuff(h, w) );

    }
}