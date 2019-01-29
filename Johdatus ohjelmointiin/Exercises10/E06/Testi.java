import java.util.*;

class Testi {
    public static void main(String [] args) {

        Ihminen yksi = new Ihminen();
        Ihminen kaksi = new Ihminen();
        yksi.nuku();
        kaksi.syo();
        yksi.juo();
        kaksi.lisaanny();

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