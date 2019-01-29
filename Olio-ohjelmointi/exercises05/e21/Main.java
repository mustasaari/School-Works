import java.util.*;

public class Main {
    public static void main (String[] args) {

        class Television implements SellableItem {
            public void sell() {
                System.out.println("TV sold");
            }
        }

        Television tv = new Television();

        SellableItem juttu = new SellableItem() {
            public void sell() {
                System.out.println("Juttu Sold");
            }
        };

        method(juttu);
        method(tv);
        method(                     //one more time
            new SellableItem() {
                public void sell() {
                    System.out.println("Juttu Sold");
                }
            }
        );

        method( ()  -> System.out.println("Thingy Sold") );

    }

    public static void method(SellableItem a) {
        a.sell();
    }
}

interface SellableItem {
    void sell();
}