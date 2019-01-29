
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
    void createArt() {
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
    
    public Animal(String a) {
        name = a;
    }
    void setName(String a) {
        name = a;
    }
    String getName() {
        return name;
    }
}