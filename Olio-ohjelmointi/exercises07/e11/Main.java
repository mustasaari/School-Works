import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {

        Path hakemisto = Paths.get("C:/Users/musta/OneDrive/Koulu/Olio-Ohjelmointi/exercises07/e11/");
        //Path hakemisto = Paths.get( System.getProperty("user.dir") ); //directory where java was run from

            try {
                Stream<Path> kek = Files.walk ( hakemisto ).filter(r -> r.toString().endsWith(".txt") );
                
                kek.forEach(a -> {
                    try {
                    List<String> lista2 = Files.readAllLines(a);
                    Stream<String> lista3 = lista2.stream();

                    lista3.filter(s->s.contains("\t")).map(d-> d.replace ("\t", "____")).forEach(f->System.out.println(f));

                    } catch (IOException o) {}
                });

            } catch (IOException e) {}

    }
}