import java.awt.Color;
import java.util.Scanner;
import java.util.*;

class Sovellus {
    public static void main(String [] args){

        /**
         *   String str = "abc";
         *     
         *   is equivalent to:
         *
         *   char data[] = {'a', 'b', 'c'};
         *   String str = new String(data);
         */

        char[] data = {'m','i','k','k','o'};
        MyString mj = new MyString(data);

        char[] data2 = {'i'};
        MyString mj2 = new MyString(data2);

        System.out.println(mj.length() +"   "  +mj.charAt(0) );

        mj.printMe();

        //mj.reverse();

        mj.printMe();


        if (mj.equals(mj2)) {               //testimetodeja
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }

        if (mj.startsWith(mj2)) {
            System.out.println("Starts with");
        }
        else {
            System.out.println("Not starts with");
        }

        if (mj2.isEmpty()) {
            System.out.println("is Empty");
        }
        else {
            System.out.println("Not empty");
        }



    }

}

class MyString {
    private char[] myChars;

    public MyString(char[] merkit) {
        myChars = merkit;
    }

    public void printMe() {
        for (int i = 0; i < length() ; i++) {
            System.out.print(myChars[i]);
        }
    }

    public int length() {
        return myChars.length;
    }

    public boolean isEmpty() {
        boolean returnValue = false;
        if (length() == 0) {
            returnValue = true;
        }
        else {
            returnValue = false;
        }
        return returnValue;
    }

    public char charAt(int i) {
        return myChars[i];
    }

    public void reverse() {
        char[] tmp = new char[length()];
        for (int i = 0; i < length(); i++) {
            tmp[i] = myChars[myChars.length -i -1];
        }
        myChars = tmp;
    }

    public boolean equals(MyString m) {
        System.out.println("Equals length : " +this.length());
        System.out.println("Input length :" +m.length());
        boolean returnValue = false;

        if (m.length() != length() ) {
            returnValue = false;
        }
        else {
            for ( int i = 0; i < this.length(); i++ ) {

                if ( m.charAt(i) == this.charAt(i) ) {
                    returnValue = true;
                }
                else {
                    returnValue = false;
                    break;
                }
            }
        }
        return returnValue;
    }

    public boolean startsWith(MyString m) {

        boolean returnValue = false;

        if (m.length() <= this.length() ) {

            for (int i = 0; i < m.length(); i++) {
                if (m.charAt(i) == this.charAt(i)) {
                    returnValue = true;
                }
                else {
                    returnValue = false;
                    break;
                }
            }
        }
        else {
            returnValue = false;
        }

        return returnValue;
    }


}