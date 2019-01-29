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

        Path filepath = Paths.get("C:/Users/musta/OneDrive/Koulu/Olio-Ohjelmointi/exercises07/e10" , filename);
        //Path filepath = Paths.get( System.getProperty("user.dir"), filename ); //directory where java was run from

        List<String> lista = new ArrayList<String>();

        try {
            lista = Files.readAllLines( filepath );
        } catch (IOException e) {}

        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("now stream ...");

        Stream<String> stream = lista.stream();

        //stream.filter( s -> s.contains("\t") ).forEach(d -> System.out.println(d)) ;      //etsii tabit

        //stream.filter( s -> s.replace('A', 'X') ).forEach(d -> System.out.println(d)) ;
        //bad return type in lambda expression  //katso alle

        //Find tabs & replace
        //stream.map(s -> s.replace ("\t", "____") ).forEach(d -> System.out.println(d));

        //filter and replace
        stream.filter(s->s.contains("\t")).map(d-> d.replace ("\t", "____")).forEach(f->System.out.println(f));



    }
}