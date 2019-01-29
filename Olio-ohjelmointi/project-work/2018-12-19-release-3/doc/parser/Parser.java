package jsonparser;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

/**
 * Mikko Json Parser
 *
 * Object for storing and writing json-data. User can store key-value pairs in object.
 * Can also store other parser-objects data as sub-objects.
 *
 * @author Mikko Mustasaari
 * @version 2017.1214
 * @since 1.0
 *
 */

public class Parser {

    /**
     * textData string stores all written data in parser-object.
     */

    String textData;

    /**
     * Constructor for parser. Sets textData to empty.
     */

    public Parser() {
        textData = "";
    }

    /**
     * Method for testing parser
     */

    public void test() {
        System.out.println("PARSER TEST");

        String[] testArray = {"string1", "string2", "string3", "string4"};
        int[] intArray = new int[]  {1,3,5,8};

        Parser testParser = new Parser();
        Parser subParser = new Parser();

        subParser.add("value1", "value2");
        subParser.add("value3", 4);
        subParser.add("value5","value6");
        subParser.add("array1", testArray);
        subParser.add("array2", testArray);
        subParser.add("boolean", true);
        subParser.add("intarray", intArray);
        subParser.add("value6", 200);

        testParser.add("value7", "value8");
        testParser.add("value9", testArray);
        subParser.add("value10", testParser);
        testParser.add("value11", subParser);

        System.out.println("Parser Test Data indented : \n" + testParser.getIndentData() );
    }

    /**
     * Better write method
     * @param file destination and filename to save to
     */

    public void write(File file) { //new save method

        try {
            PrintWriter out = new PrintWriter(file);
            out.println(getIndentData());
            out.close();
        } catch (IOException e) {}
    }

    /**
     * Returns objects textData string encapsulated in curly brackets
     * @return Return textData string
     */

    public String getTextData() {
        String returnTextData = "";
        if (textData.length() > 2) {
            returnTextData = "{\n" + textData.substring(0, textData.length() - 2) + "\n}";
        }
        else {
            returnTextData ="{\n}";
        }
        return  returnTextData;
    }

    /**
     * Add String Key-value pair
     * @param key Key in string format
     * @param value value for key in string
     */

    public void add(String key, String value) {
        textData += makeKey(key);
        textData += "\"";
        textData += value;
        textData += "\",\n";
    }

    /**
     * Add integer key-value pair
     * @param key key value in string
     * @param value integer value
     */

    public void add(String key, int value) {
        textData += makeKey(key);
        textData += value;
        textData += ",\n";
    }

    /**
     * Add boolean key-value pair
     * @param key String name for key
     * @param value true or false as boolean value
     */

    public void add(String key, boolean value) {
        textData += makeKey(key);
        if (value) {
            textData += "true";
        }
        else {
            textData += "false";
        }
        textData += ",\n";
    }

    /**
     * Add string-array value
     * @param key key value for array
     * @param values array is iterated under given key, inside square brackets
     */

    public void add(String key, String[] values) {
        textData += makeKey(key);
        textData += "[";
        for (int i = 0; i < values.length ; i++) {
            textData += "\"";
            textData += values[i];
            textData += "\"";
            if (i < values.length -1) {
                textData += ",";
            }
        }
        textData += "],\n";
    }

    /**
     * Add integer-array.
     * @param key Key value in string formar
     * @param values integer-array
     */

    public void add(String key, int[] values) {
        textData += makeKey(key);
        textData += "[";
        for (int i = 0; i < values.length ; i++) {
            textData += Integer.toString(values[i]);
            if (i < values.length -1) {
                textData += ",";
            }
        }
        textData += "],\n";
    }

    /**
     * Add another parser-object's data inside this parser object
     * @param key-value in string format
     * @param parser Parser to extract data from
     */

    public void add(String key, Parser parser) {
        textData += makeKey(key);
        textData += parser.getTextData();
        textData += ",\n";
    }

    public String getString() {
        return textData;
    }

    /**
     * Sets textData to empty
     */

    public void clear()
    {
        textData = "";
    }

    /**
     * Returns indented string presentation of objects data
     * @return indented data
     */

    public String getIndentData() {

        String tmpData = getTextData();
        String returnData = "";
        int indent = 0;
        boolean indentLine = false;

        for (int i = 0; i < tmpData.length(); i++) {

            if (tmpData.charAt(i) == '}' ) {
                indent -= 3;
            }

            if (indentLine) {
                for (int k = 0; k < indent; k++) {
                    //System.out.print(" ");
                    returnData += " ";
                }
                indentLine = false;
            }

            if (tmpData.charAt(i) == '{' ) {
                indent += 3;
            }

            //System.out.print( tmpData.charAt(i) );
            returnData += tmpData.charAt(i);

            if (tmpData.charAt(i) == '\n') {
                indentLine = true;
            }
        }
        return returnData;
    }

    /**
     * Add quotation marks around string and colon in the end
     * @param a key-string
     * @return key-string capsulated in quotation marks with colon in the end
     */

    private String makeKey(String a) {
        String keyString = "\"" + a + "\": ";
        return keyString;
    }
}