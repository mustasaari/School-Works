
package fi.tamk.tiko.olioohjelmointi.util;

public class Util {

    public static void doStuff(int n, String merkki) {

        String [][] taulukko = new String[n][n];

        for (int i = 0; i < n ; i++ ) {

            for(int j = 0; j < n; j++) {

                if(i + 1 == n-n/2) {    //poikkiviiva
                   //System.out.print(merkki);  
                   taulukko[i][j] = merkki;   
                }
                else {

                    if (j==0 || j == n-1) { //reunat
                        //System.out.print(merkki);
                        taulukko[i][j] = merkki;
                    }
                    else {
                        //System.out.print(" ");
                        taulukko[i][j] = " ";
                    }

                }

            }
            

        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(taulukko[i][j]);
            }
            System.out.println();
        }

    }

    public static void printStuff(String b) {
        System.out.print(b);
    }
}