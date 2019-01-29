

public class Main {

    public static void main(String[] args) {
        SoftDrink colacola = new SoftDrink();
        colacola.sell();
        Dog spot = new Dog();
        Bird pulu = new Bird();
        spot.sell();
        pulu.sell();

        method(colacola);
        method(spot);
        method(pulu);
        //Object kek = new Object();
        //method(kek);    //Object cannot be converted to SellableItem
    }

    public static void method(SellableItem a) {
            //ne jotka toteuttavat sellableitem rajapinnan
    }

}

interface SellableItem {
    void sell();
}

class SoftDrink implements SellableItem {

    public void sell() {
        System.out.println("soft drink has been sold");
    }
}

class Dog implements SellableItem {
    public void sell() {
        System.out.println("Dog has been sold");
    }
}

class Bird implements SellableItem {
    public void sell() {
        System.out.println("Bird has been sold");
    }
}