

public class Main {

    public static void main(String[] args) {
        SoftDrink colacola = new SoftDrink();
        colacola.sell();
        Dog spot = new Dog();
        Bird pulu = new Bird();
        spot.sell();
        pulu.sell();
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