import java.util.*;

class Testi {
    public static void main(String [] args) {

        Ihminen yksi = new Ihminen();
        Ihminen kaksi = new Ihminen();
        Ohjelmoija kolme = new Ohjelmoija();
        yksi.nuku();
        kaksi.syo();
        yksi.juo();
        kaksi.lisaanny();
        kolme.nuku();
        kolme.ohjelmoi();
        kolme.juo();
        kolme.syo();
        kolme.osallistuCyberGothDanceJuhlaan();

    }
}

class Ihminen {

   public void nuku(){
       System.out.println("Ihminen nukkuu");
   }
   public void syo(){
        System.out.println("Ihminen syo");
   }
   public void juo(){
        System.out.println("Ihminen juo");
   }
   public void lisaanny(){
         System.out.println("Ihminen lisaantyy");
   }
}

class Ohjelmoija extends Ihminen {

    public void ohjelmoi() {
        System.out.println("Ohjelmoija ohjelmoi");
    }

    public void osallistuCyberGothDanceJuhlaan() {
    // ai mihin? -> https://www.youtube.com/watch?v=gPbVRpRgHso
        System.out.println("Ohjelmoija osallistu CyberGothDanceJuhlaan");
    }
    @Override
    public void syo(){
        System.out.println("Ohjelmoija syo pitsaa");
    }
    @Override
    public void juo(){
        System.out.println("Ohjelmoija juo energiajuomaa");
    }
}