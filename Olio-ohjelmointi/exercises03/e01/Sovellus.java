import java.util.ArrayList;

class Sovellus {
    public static void main(String [] args){

        ArrayList<Integer> intArray = new ArrayList<Integer>();

        Olio kek = new Olio();

        intArray.add(12);
        intArray.add(new Integer(15));

    for(int i : intArray) {
        System.out.println(i);
    }

    }
}