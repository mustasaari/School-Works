import java.util.ArrayList;

class Sovellus {
      public static void main(String... args) {

          int counter = 0;

          for (int i = 1; i < 101; i++) {
              System.out.format("%03d ",i);
              counter++;
              if (counter == 10) {
                  counter = 0;
                System.out.format("%n");
              }
          }

      }
}