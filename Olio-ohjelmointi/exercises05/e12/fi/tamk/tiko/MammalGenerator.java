package fi.tamk.tiko;

public abstract class MammalGenerator {

    public abstract void start(Mammal mammal);

    public void launch( String[] x ) {
        System.out.println("launched");

        if (x[0].equals("Dog") ) {
            Dog diu = new Dog("hurtta");
            start(diu);
        }
        else {
            Human mikko = new Human("Mikko");
            start(mikko);
        }

    }


public abstract class Mammal extends Animal {
    public Mammal(String a) {
        super(a);
    }
    void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }
    public abstract void makeSound();
}

public class Dog extends Mammal {
    public Dog(String nam) {
        super(nam);
    }

    public void sniffButt() {
        System.out.println("Sniffing other dogs butt");
    }

    public void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Human extends Mammal {
    public Human(String a) {
        super(a);
    }
    public void createArt() {
        System.out.println("Creating art");
    }
    public void makeSound() {
        System.out.println("lol bur kek rofl");
    }
}

class Bird extends Animal {

    public Bird(String a) {
        super(a);
    }
    void fly() {
        System.out.println("Flying");
    }
}

abstract class Animal {
    String name;
    boolean alive;
    int healthAmount;
    
    public Animal(String a) {
        name = a;
        alive = true;
        healthAmount = 0;
    }
    void setName(String a) {
        name = a;
    }
    String getName() {
        return name;
    }
    void die() {
        System.out.println("animal died");
        alive = false;
    }
    boolean isAlive() {
        return alive;
    }
    boolean eats(Animal a) {
        boolean eatSuccess = false;

        if (this instanceof Human) {
            System.out.println("Human eats");
            a.die();
            eatSuccess = true;
        }
        if (this instanceof Dog && (a instanceof Bird || a instanceof Human) ) {
            System.out.println("Dog eats");
            a.die();
            eatSuccess = true;
        }
        if (this instanceof Bird) {
            System.out.println("Bird cant eat anything");
            eatSuccess = false;
        }

        if ( eatSuccess ) {
            healthAmount++;
        }

        System.out.println("eating has failed");
        return eatSuccess;
    }

    int getHealthAmount() {
        return healthAmount;
    }
    void setHealthAmount(int x) {
        healthAmount = x;
    }
}


}