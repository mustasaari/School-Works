
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;
import java.util.*;

public class ReadText {
  public static void main(String [] args) throws IOException {
    String textFileName = "input.txt";
    int muuttuja1 = 0;
    int suurin = 0;
    int pienin = 0;
    int merkkeja = 0;
    List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());

    for(int i=0; i<allLines.size(); i++) {
        String line = allLines.get(i);
        //System.out.print(line);
        if (!line.equals("")) {
          muuttuja1 = Integer.parseInt(line);
          //System.out.println(muuttuja1);
          if (muuttuja1 > suurin) {
            suurin = muuttuja1;
          }
          if (muuttuja1 < pienin) {
            pienin = muuttuja1;
          }
        }
    }
//aa
  for(int i=0; i<allLines.size(); i++) {
        String line = allLines.get(i);
        //System.out.print(line);
        if (!line.equals("")) {
          muuttuja1 = Integer.parseInt(line);
          //System.out.println(muuttuja1);
          for (int j = pienin; j <= suurin +1; j ++) {   //tulosteluhärdelli

              if (j == suurin +1)
                System.out.println("");
              else if (j == 0)
                System.out.print("|");
              else if (j > 0 && j <= muuttuja1 && muuttuja1 > 0)
                System.out.print("+");
              else if (j < 0 && j >= muuttuja1 && muuttuja1 < 0 )
                System.out.print("-");
              else if (j < muuttuja1 || j > muuttuja1)
                System.out.print(" ");
              else
                System.out.print(" ");

          }

        }

//aa
    }

  }
}