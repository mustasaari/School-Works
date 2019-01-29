
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

        method1(pulu);
        method1(koiro);
        method1(human);

        //method2(pulu); //Bird cannot be converted to Mammal
        method2(koiro);
        method2(human);

        //method3(pulu);  //Bird cannot be converted to Human
        //method3(koiro); //Dog cannot be converted to Human
        method3(human);

        method4(pulu);
        method4(human);
        method4(koiro);
    }

    public static void method1(Animal a) {

    }
    public static void method2(Mammal a) {

    }
    public static void method3(Human a) {

    }
    public static void method4(Object a) {

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