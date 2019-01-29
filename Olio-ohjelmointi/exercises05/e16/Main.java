import java.util.*;

public class Main {

    public static void main(String[] args) {
        Store kauppa = new Store("erikoiskauppa");
        SoftDrink colacola = new SoftDrink();
        Dog spot = new Dog();
        Bird pulu = new Bird();

        kauppa.addSellableItem(colacola);
        kauppa.addSellableItem(colacola);
        kauppa.addSellableItem(spot);
        kauppa.addSellableItem(spot);
        kauppa.addSellableItem(pulu);
        kauppa.addSellableItem(pulu);

        kauppa.showInventory();

        kauppa.sellSellableItem(2);

        kauppa.showInventory();

        kauppa.sellAllItems();

        kauppa.showInventory();
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

class Store {
    String name;
    ArrayList<SellableItem> inventory = new ArrayList<>();

    public Store(String x) {
        name = x;
    }

    void addSellableItem(SellableItem si) {
        inventory.add(si);
    }

    void showInventory() {
        System.out.println("Inventory listing START ------");
        for (SellableItem x : inventory) {
            System.out.print("inv ::: ");
            x.sell();
        }
        System.out.println("Inventory listing END ------");
    }

    void sellSellableItem(int i) {
        inventory.get(i).sell();
        inventory.remove(i);
    }

    void sellAllItems() {
        System.out.println("SellAllStart");
        for (SellableItem x : inventory) {
            x.sell();
        }
        inventory.clear();
    }
}