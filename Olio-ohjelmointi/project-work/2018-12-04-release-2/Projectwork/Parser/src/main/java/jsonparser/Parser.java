package jsonparser;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 */

public class Parser {

    String textData;

    public Parser() {
        textData = "{\n";
    }

    public void test() {
        System.out.println("TEST PARSER");
    }

    public void write() {

        String writeData = textData.substring(0, textData.length() -2); //remove last comma

        writeData += "\n}";

        try {                       //write txt file
            PrintWriter out = new PrintWriter("filename.json");
            out.println(writeData);
            out.close();
        } catch (FileNotFoundException e) { }

    }

    /**
     * Add String value
     * @param a
     * @param b
     */

    public void add(String a, String b) {
        textData += "\"";
        textData += a;
        textData += "\":";
        textData += " \"";
        textData += b;
        textData += "\",\n";
    }

    /**
     * Add int value
     * @param a
     * @param b
     */

    public void add(String a, int b) {
        textData += "\"";
        textData += a;
        textData += "\": ";
        textData += b;
        textData += ",\n";
    }

    public void add(Parser a) {
        textData += a.getString();
    }

    public String getString() {
        return textData;
    }

    public void clear() {
        textData = "{\n";
    }

}