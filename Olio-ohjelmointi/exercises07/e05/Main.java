
class Main {

    public static void main(String [] args) {
        //flyMe( () -> System.out.println("lennaaa") );
        Bird lintu = new Bird();
        flyMe(lintu);

        Airplane kone = new Airplane();
        flyMe(kone);

        flyMe ( new Flyable() { 
            public void fly(int speed) { 
                System.out.println("speed is :" +speed); 
            }  
        } );

        Flyable orava = (a) -> System.out.println("orava lentaa : " +a);
        flyMe(orava);


        flyMe ( (int wtf) -> System.out.println("pff :" +wtf) );

        flyMe ( (wtf) -> System.out.println("pfff :" +wtf) );

        flyMe (System.out::println);
        
    }
        
    public static void flyMe(Flyable a) {  
        a.fly(20);
        a.fly(-20);
    }

}

interface Flyable {
    public void fly(int speed);
}

class Bird implements Flyable {

    public void fly (int speed) {
        if (speed >= 0) {
            System.out.println("bird flying forward");
        }
        else {
            System.out.println("bird flying backwards");
        } 
    }
}

class Airplane implements Flyable {
    public void fly (int speed) {
        System.out.println("airplane speed is " +speed);
    }
}