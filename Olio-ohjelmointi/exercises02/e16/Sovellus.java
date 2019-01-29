import java.awt.Color;
import java.util.Scanner;
import java.util.*;

class Sovellus {
    public static void main(String [] args){

        char[] data = {'m','i','k','k','o'};
        MyString mj = new MyString(data);

        System.out.println(mj.length() +"   "  +mj.charAt(4) );

    }

}

class MyString {
    private char[] myChars;

    public MyString(char[] merkit) {
        myChars = merkit;
    }

    public int length() {
        return myChars.length;
    }

    public char charAt(int i) {
        return myChars[i];
    }


}