import java.util.*;

public class E07 {
    public static void main(String [] args) {
        String [] taulukko =  {"Mikko","Henna","Eino","Aapo","Jussi"};

            for (int i = 0; i < taulukko.length; i = i+2) {
            System.out.println(taulukko[i]);
        }

    }
}