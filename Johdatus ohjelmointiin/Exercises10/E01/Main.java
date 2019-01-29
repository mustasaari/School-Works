import java.util.*;


class Opiskelija {
    // tietoa, muuttujia, attribuutteja:
    private String nimi; 
    public Opiskelija(String n) {
       setNimi(n);
    }
    public void setNimi(String n) {
       nimi = n;
    }
    public String getNimi() {
       return nimi;
    }
}

class Olut {
    String merkki = "";
    double maara;
    double voltit;

    public Olut(String a, double b, double c){
        merkki = a;
        maara = b;
        voltit =c;
    }

    public void juo(){
        if (maara > 0) {
            System.out.println("Olutta juodaan");
            maara -= 0.1;
        }

        if (maara <= 0.0) {
            System.out.println("Olut on loppu");
            maara = 0.0;                                // << asetetaan olut nollaan jos se on loppu
        }
    }

    public double paljonJaljella(){
        return maara;
    }
}

class Main {
    public static void main(String [] args) {
        Opiskelija jaska = new Opiskelija("Jaska Virtanen");
        System.out.println(jaska.getNimi());
        Olut lapinkulta = new Olut("lapin kulta", 0.5, 4.5);

        for (int i = 10; i > 0; i--) {
            lapinkulta.juo();
            System.out.println(String.format("%.2f", lapinkulta.paljonJaljella()));
        }
    }
}