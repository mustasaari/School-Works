import java.util.*;

class Main {
    public static void main(String [] args) {
        Koira musti = new Koira();        //Nisakas is abstract; cannot be instantiated
        Ihminen jaska = new Ihminen();

        musti.synnyta();
        jaska.synnyta();
        jaska.luoTaidetta();
        musti.nuuhkiPyllya();
        jaska.aantelehdi();
        musti.aantelehdi();
        //jaska.nuuhkiPyllya();
        //musti.luoTaidetta();
    }
}

abstract class Nisakas {

        public void synnyta() {
        System.out.println("synnytan lapsen");
        }

        abstract void aantelehdi();    //Koira is not abstract and does not override abstract method aantelehdi()
            

}

class Ihminen extends Nisakas {
    public void luoTaidetta () {
        System.out.println("Luo taidetta");
    }

    public void aantelehdi() { 
            System.out.println("Ihminen puhuu");
        }
}

class Koira extends Nisakas {

    public void nuuhkiPyllya() {
       System.out.println  ("nuuhkii toisen koiran pyllya");
    }

    public void aantelehdi() { 
            System.out.println("koira haukkuu");
    }
}