import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        String filename = args[0];
        //String filename = "text.txt";

        Path filepath = Paths.get("C:/Users/musta/OneDrive/Koulu/Olio-Ohjelmointi/exercises07/e09" , filename);

        List<String> lista = new ArrayList<String>();

        try {
            lista = Files.readAllLines( filepath );
        } catch (IOException e) {}

        for (String x : lista) {
            System.out.println(x);
        }

    }
}