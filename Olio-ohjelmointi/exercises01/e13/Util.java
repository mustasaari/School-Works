
package fi.tamk.tiko.olioohjelmointi.util;
import java.util.Arrays;
import java.io.*;

public class Util {

    public static String readFile() {   //From Google

        String retuString = "";

        // The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                retuString += line;
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

        return retuString;

    }

    public static int[] doStuff(String a) {

        int intCount = 0;

        String[] splitted = a.split(",");
        int[] intArray = new int[splitted.length];

        for (int i = 0; i < splitted.length; i++ ) {  //onko välilyönti+merkki yhdistelmiä
            intArray[i] = Integer.parseInt(splitted[i]);
        }
        Arrays.sort(intArray);
        return intArray;
    }

    public static void doStuff2(int[] b, int c) {
        int tulos = 0;

        for (int x: b) {    //print array
            System.out.print(" " +x);
        }
        System.out.println("");

        for (int i = 0; i < b.length; i++ ) {
            if ( b[i] == c ) {
                System.out.println("Numero " +c +" loytyy indeksista " +tulos);
                break;
            }
            if ( i == b.length -1) {
                System.out.println("Ei loydy");
            }
            tulos++;
        }


    }
}