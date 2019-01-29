
class Main {
    public static void main (String[] args) {
        Dog koiro = new Dog("dogekoira");
        System.out.println(koiro.getName());
        koiro.giveBirthToLivingChild();
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
}