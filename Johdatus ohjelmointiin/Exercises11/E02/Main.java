import java.util.*;

class Main {
    public static void main(String [] args) {
        Koira musti = new Koira();        //Nisakas is abstract; cannot be instantiated
        Ihminen jaska = new Ihminen();

        musti.synnyta();
        jaska.synnyta();
        jaska.luoTaidetta();
        musti.nuuhkiPyllya();
        //jaska.nuuhkiPyllya();
        //musti.luoTaidetta();
    }
}

abstract class Nisakas {

        public void synnyta() {
        System.out.println("synnytan lapsen");
        }
}

class Ihminen extends Nisakas {
    public void luoTaidetta () {
        System.out.println("Luo taidetta");
    }
}

class Koira extends Nisakas {

    public void nuuhkiPyllya() {
       System.out.println  ("nuuhkii toisen koiran pyllyä");
    }
}