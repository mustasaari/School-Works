import java.util.*;



class E07 {
    public static void main(String [] args) {
        Scanner syote = new Scanner (System.in);

        System.out.println("Taulukon leveys : ");
        int leveys = syote.nextInt();
        System.out.println("Taulukon korkeus : ");
        int korkeus = syote.nextInt();

        int [][] taulukko = new int [korkeus][leveys];


        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                 System.out.print("Rivi "+i +" Sarake " +j +" : ");
                taulukko[i][j] = syote.nextInt();
            }
    
        }

        printTwoDimArray(taulukko);  // <<<<-----
        etsiSuurin(taulukko);



    }

    public static void printTwoDimArray(int[][] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void etsiSuurin(int [][] taulu) {
        int suurin = 0;

        for (int i = 0; i < taulu.length; i++) {
            for (int j = 0; j< taulu[i].length; j++) {
                if (taulu[i][j] > suurin) {
                    suurin = taulu [i][j];
                }
            }
        }

        System.out.println("Suurin oli : " +suurin);
    }


}