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
                Energiajuoma ed = new Energiajuoma();
        //jaska.nuuhkiPyllya();
        //musti.luoTaidetta();
        App.metodi(musti);      //E07 <<< musti menee läpi koska musti toteuttaa mytavasia
        //App.metodi(jaska);    //jaska ei mene läpi
        App.metodi(ed);         //energiajuoman voi myös myydä



        ed.myy(); // "energiajuoma myyty"
        musti.myy();
    }
}

class Energiajuoma implements MyytavaAsia {
    public void myy() {
        System.out.println(" energiajuoma myyty");
    }
}

interface MyytavaAsia {
    void myy();
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

class Koira extends Nisakas implements MyytavaAsia {

    public void myy() {
        System.out.println("Koira myyty");
    }

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
    public static void metodi(MyytavaAsia a) {

    }
}