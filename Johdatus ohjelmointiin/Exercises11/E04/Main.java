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

        App.method1(musti);     //jaska ei toiminut
        App.method2(jaska);     //musti ei toiminut
        App.method3(jaska);
        App.method3(musti);
        App.method4(musti);
        App.method4(jaska);


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



class App {
    public static void main(String [] args) {

    }
    public static void method1(Koira a) {
        System.out.println("metodi1");
    }
    public static void method2(Ihminen a) {
        System.out.println("metodi2");
    }
    public static void method3(Nisakas a) {
        System.out.println("metodi3");
    }
    public static void method4(Object a) {
        System.out.println("metodi4");
    }
}