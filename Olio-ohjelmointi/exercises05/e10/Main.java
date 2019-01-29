
class Main {
    public static void main (String[] args) {
        Dog koiro = new Dog("dogekoira");
        System.out.println(koiro.getName());
        koiro.giveBirthToLivingChild();
        koiro.sniffButt();
        koiro.makeSound();

        Human human = new Human("MMikko");
        System.out.println(human.getName() );
        human.giveBirthToLivingChild();
        human.createArt();
        human.makeSound();

        Bird pulu = new Bird("Ossi");
        System.out.println(pulu.getName());
        pulu.fly();

        if (human.eats(koiro) ) {
            System.out.println("Success");
            System.out.println(koiro.isAlive());
        }

        if (koiro.eats(pulu) ) {
            System.out.println("Success");
            System.out.println(koiro.isAlive());
        }
        if (pulu.eats(human)) {
            System.out.println("Success");
            System.out.println(human.isAlive());
        }


    }

    public static void method2(Mammal a) {
        //a.sniffButt(); //error: cannot find symbol
        System.out.println("method 2 -----------------------------------------");
        a.giveBirthToLivingChild();
        a.makeSound();
        if (a instanceof Human) {   //tyyppimuunnos
            Human b = (Human)a;
            System.out.print(b.getName() +" is now ");
            b.createArt();
        }
        if (a instanceof Dog) {
            Dog b = (Dog)a;
            System.out.print(b.getName() +" is now ");
            b.sniffButt();
        }

    }
}

abstract class Mammal extends Animal {
    public Mammal(String a) {
        super(a);
    }
    void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }
    abstract void makeSound();
}

class Dog extends Mammal {
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
    
    public Animal(String a) {
        name = a;
        alive = true;
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
        if (this instanceof Human) {
            System.out.println("Human eats");
            a.die();
            return true;
        }
        if (this instanceof Dog && (a instanceof Bird || a instanceof Human) ) {
            System.out.println("Dog eats");
            a.die();
            return true;
        }
        if (this instanceof Bird) {
            System.out.println("Bird cant eat anything");
            return false;
        }

        System.out.println("eating has failed");
        return false;
    }
}