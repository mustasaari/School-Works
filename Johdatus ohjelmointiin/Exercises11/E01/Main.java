import java.util.*;

class Main {
    public static void main(String [] args) {
        Koira jee = new Koira();        //Nisakas is abstract; cannot be instantiated
        jee.synnyta();
    }
}

abstract class Nisakas {

        public void synnyta() {
        System.out.println("synnytan lapsen");
        }
}

class Koira extends Nisakas {
}