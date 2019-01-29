
import fi.tamk.tiko.MammalGenerator;

public class Main extends MammalGenerator {

    @Override
    public void start(Mammal mammal) {
        mammal.makeSound();
    }

    public static void main(String... args) {
        new Main().launch(args);
    }
}