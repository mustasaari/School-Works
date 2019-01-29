import java.util.*;

class Testi {
    public static void main(String [] args) {

        Ihminen yksi = new Ihminen("Harri");
        Ihminen kaksi = new Ihminen("Jussi");
        Ohjelmoija kolme = new Ohjelmoija("Mikko");

        //yksi.setNimi("Harri");
        //kaksi.setNimi("Jussi");
        //kolme.setNimi ("Mikko");

        yksi.nuku();
        kaksi.syo();
        yksi.juo();
        kaksi.lisaanny();
        kolme.nuku();
        kolme.ohjelmoi();
        kolme.juo();
        kolme.syo();
        kolme.osallistuCyberGothDanceJuhlaan();

        System.out.println(yksi.getNimi() +kaksi.getNimi() +kolme.getNimi());

    }
}

class Ihminen {

    private String nimi;

    public Ihminen(String n) {
        nimi = n;
        //System.out.println("konstructori");
    }

    public String getNimi() {
        return nimi;
    }
    public void setNimi(String n) {
        this.nimi = n;
    }


   public void nuku(){
       System.out.println(nimi +" nukkuu");
   }
   public void syo(){
        System.out.println(nimi +" syo");
   }
   public void juo(){
        System.out.println(nimi +" juo");
   }
   public void lisaanny(){
         System.out.println(nimi +" lisaantyy");
   }
}

class Ohjelmoija extends Ihminen {

    public Ohjelmoija (String n) {
        super(n);
    }

    public void ohjelmoi() {
        System.out.println(getNimi() +" ohjelmoi");
    }

    public void osallistuCyberGothDanceJuhlaan() {
    // ai mihin? -> https://www.youtube.com/watch?v=gPbVRpRgHso
        System.out.println(getNimi() +" osallistu CyberGothDanceJuhlaan");
    }
    @Override
    public void syo(){
        System.out.println(getNimi() +" syo pitsaa");
    }
    @Override
    public void juo(){
        System.out.println(getNimi() +" juo energiajuomaa");
    }
}