
class Main {
    public static void main (String[] args) {
        Dog koiro = new Dog("dogekoira");
        System.out.println(koiro.getName());
        koiro.giveBirthToLivingChild();
        koiro.sniffButt();

        Human human = new Human("MMikko");
        System.out.println(human.getName() );
        human.giveBirthToLivingChild();
        human.createArt();
    }
}

abstract class Mammal {
    String name;
    public Mammal(String a) {
        name = a;
    }
    void setName(String a) {
        name = a;
    }
    String getName() {
        return name;
    }
    void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }
}

class Dog extends Mammal {
    public Dog(String nam) {
        super(nam);
    }

    public void sniffButt() {
        System.out.println("Sniffing other dogs butt");
    }
}

class Human extends Mammal {
    public Human(String a) {
        super(a);
    }
    void createArt() {
        System.out.println("Creating art");
    }
}