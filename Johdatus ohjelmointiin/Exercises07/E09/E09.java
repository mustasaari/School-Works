import java.util.*;



class E09 {
    public static void main(String [] args) {
        Scanner syote = new Scanner (System.in);

        System.out.println("Taulukon leveys : ");
        int leveys = syote.nextInt();
        System.out.println("Taulukon korkeus : ");
        int korkeus = syote.nextInt();

        String [][] taulukko = new String [korkeus][leveys];


        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                if(j == 0 || j == taulukko[i].length -1 || (j == i +1 && i != 0) ) {       // <<--- leveys 6 x korkeus 5 täsmälleen oikein
                taulukko[i][j] = "X";
                }
                else {
                    taulukko[i][j] = " ";
                }
            }
    
        }

        printTwoDimArray(taulukko);  // <<<<----- tulostus
        //etsiSuurin(taulukko);



    }

    public static void printTwoDimArray(String [][] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }

}