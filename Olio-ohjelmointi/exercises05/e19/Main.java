import java.util.*;

public class Main {
    public static void main (String[] args) {

        //Outer.Inner olio = new Outer().new Inner();
        //olio.print();
        Outer olio = new Outer();
        olio.doSomething();
    }
}

class Outer {

    private int x = 12;

    //public Inner createInner() {
    //    Inner tmp = new Inner();
    //    return tmp;
    //}

    public void doSomething() {

        int a = 12;
        final int b = 99;
        int c;
        //int c = 77; // ei toimi jos tieto muutetaan
        c = 88;

        class Inner {
            void print() {
                System.out.println(a + "  " +b + "  " +c  +"  " +x);
            }
        }

        Inner inneri = new Inner();
        inneri.print();
    }

}