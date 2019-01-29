import java.util.ArrayList;
import java.util.stream.*;
import java.util.function.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        ArrayList<String> yay = new ArrayList<String>();
        for (int i = 1 ; i < 11 ; i++) {
            yay.add(Integer.toString(i));
        }
        taulukko on valmis

        Stream<String> stream = yay.stream();

        IntStream intStream = stream.mapToInt( new Kuuntelija() );

        intStream.forEach( new Printable() );

        //yay.stream().forEach(System.out::println);


    }

}

class Kuuntelija implements ToIntFunction<String> {
    @Override
    public int applyAsInt(String a) {
        int r;
        r = Integer.parseInt(a);
        return r;
    }
}

class Printable implements IntConsumer {
    @Override
    public void accept(int i) {
        System.out.println(i);
    }
}