
package fi.tamk.tiko.olioohjelmointi;
import fi.tamk.tiko.olioohjelmointi.util.*;

class Main {
    public static void main(String [] args) {

        ArrayUtil.printStuff();
        if (ArrayUtil.isInArray("b", "b", "c") ) {
            System.out.println("was true");
        }
        else {
             System.out.println("was false");
        }

    }
}