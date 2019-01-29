
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {

        //System.out.println("H:n tulostaja. Anna korkeus : ");
        //Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();

        int[] anArray  = { 1,2,3,4,5,6} ;

        int[] puoliArray = Util.doStuff(anArray);

        //tulostus
        for (int i = 0; i < puoliArray.length; i++) {
            System.out.println(puoliArray[i]);
        }

    }
}