import java.util.ArrayList;


enum BodyStyle {
    SUV, ESTATE
}

class Sovellus {
      public static void main(String... args) {

        final int SUV = 1;
        final int ESTATE = 2;

         Car merc = new Car("Mercedes GLC", BodyStyle.SUV);
         System.out.println( merc );    
      }
}

class Car {

    String nimi = "";
    BodyStyle bodyStyle;

    public Car(String name, BodyStyle x) {
        nimi = name;
        bodyStyle = x;
    }

     public String toString() {
        String returnString = "";
        returnString += nimi;
        returnString += bodyStyle;

         return returnString;
     }

}