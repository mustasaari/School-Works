import model.*;
import java.util.*;

class Main {
    public static void main(String[] Args) {
        System.out.println("Hello");

        Person ukko1 = new Person();
        Person ukko2 = new Person();
        Person ukko3 = new Person();


        ukko1.setName("Hannu");
        ukko2.setName("Juha");
        ukko3.setName("Kuha");



        Team tiimi = new Team("urheilu joukkue");
        System.out.println(ukko1.getName());

        for (int i = 0; i < 10; i++) {
            tiimi.addPerson(ukko1);
            tiimi.addPerson(ukko2);
            tiimi.addPerson(ukko3);
        }

        tiimi.removePlayer(2);
        tiimi.removePlayer(5);


        tiimi.getTeam();
    }
}