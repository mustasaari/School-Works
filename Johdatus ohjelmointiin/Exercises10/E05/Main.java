import java.util.*;

class Auto {
    private int bensat = 50;

    public void ajelu(int humalaCheck) {
        if (humalaCheck < 5) {
        System.out.println("auto ajelee");
        bensat--;
        System.out.println("bensaa on tankissa :" +bensat +" litraa");
        }
        else {
            System.out.println("Liian jurrissa ajamiseen");
        }
    }
}

class Opiskelija {
    // tietoa, muuttujia, attribuutteja:
    private String nimi; 
    private int humalaAste = 0;
    public Opiskelija(String n) {
       setNimi(n);
    }
    public void setNimi(String n) {
       nimi = n;
    }
    public String getNimi() {
       return nimi;
    }
    public void juo(Olut x) {
        System.out.println(nimi +" juo olutta merkiltaan " +x.merkki +" joka on " +x.voltit+" prosenttista ja jota on jaljella " +x.maara );
        x.juo();
        if (x.maara >= 0.05) {
            humalaAste++;
        }
    }
    public int getHumalaAste() {
        return humalaAste;
    }
    public void ajaAuto(Auto x) {
        x.ajelu(humalaAste);
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
        if (maara > 0.0) {
            System.out.println("Olutta juodaan");
            maara -= 0.1;

        }

        if (maara < 0.00) {
            System.out.println("Olut on loppu");
            maara = 0.0;                                // << asetetaan olut nollaan jos se on loppu
        }

        maara = Math.round(maara * 100);        // <<--- pyoristys
        maara = maara/100;
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
        Olut karhu = new Olut("karhu", 0.7 , 7.7 );
        Auto foortti = new Auto();

        for (int i = 10; i > 0; i--) {
            jaska.juo(karhu);
            jaska.ajaAuto(foortti);
            System.out.println("Ja humalan taso on " +jaska.getHumalaAste());
            //System.out.println(String.format("%.2f", karhu.paljonJaljella()));
        }
    }
}