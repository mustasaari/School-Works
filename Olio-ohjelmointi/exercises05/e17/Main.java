import java.util.*;

public class Main {
    public static void main (String[] args) {

        Outer.Inner olio = new Outer().createInner();
        olio.print();
    }
}

class Outer {

    private int x = 12;

    public Inner createInner() {
        Inner tmp = new Inner();
        return tmp;
    }

    class Inner {
        void print() {
            System.out.println(x);
        }

    }

}