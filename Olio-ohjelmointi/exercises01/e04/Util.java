
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static void doStuff() {

        for (int i = 1; i <10; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 9; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}