
class Main {

    public static void main(String [] args) {
        flyMe( () -> System.out.println("lennaaa") );
    }
        
    public static void flyMe(Flyable a) {
        System.out.println("flyMe alkaa");
        a.fly();
    }

}

interface Flyable {
    public void fly();
}