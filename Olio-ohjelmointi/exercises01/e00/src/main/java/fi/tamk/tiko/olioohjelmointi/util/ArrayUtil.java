
package fi.tamk.tiko.olioohjelmointi.util;

public class ArrayUtil {

    public static void printStuff() {
        System.out.println("Hello World!");  
    }


    public static boolean isInArray(String item, String... items) {

        for (String i: items) {
            if (item.equals(i))
            return true;
        }

        return false;
    }


  public static String filterAndUpperCase(String item, String... items) {
      String filterString = "";

      for(String i: items) {
        String a = i.toUpperCase();
        String b = item.toUpperCase();

          if (!a.equals(b) ) {
            filterString += i.toUpperCase();
          }
      }

      return filterString;

    }
}