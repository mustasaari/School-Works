

class Main {
    public static void main (String[] args) {
        Dog koiro = new Dog();
        koiro.giveBirthToLivingChild();
    }
}

abstract class Mammal {
    void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }
}

class Dog extends Mammal {

}