import java.util.*;



class E10 {
    public static void main(String [] args) {
        Scanner syote = new Scanner (System.in);
        int leveys;
        int korkeus;
        do {
        System.out.println("Pelin leveys (min 10) : ");     //kysellään kentän koko
        leveys = syote.nextInt();
        } while (leveys < 10);
        do {
        System.out.println("Pelin korkeus (min 10) : ");
        korkeus = syote.nextInt();
        } while(korkeus < 10);
        String [][] theGame = new String [korkeus][leveys];




        theGame = peliAlue(theGame);    // pelin kehykset
        theGame = pelaajanPaikka(theGame, 5, 5);              
        tulosta(theGame);               // <<<<----- tulostus



    }

    public static void tulosta(String [][] myArray) {           //Tulostin

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }                                                           //Tulostin loppuu



    public static String [][] peliAlue(String [][] kentta) {     //pelialue alkaa

        for (int i = 0; i < kentta.length; i++) {
            for (int j = 0; j < kentta[i].length; j++) {
                if(j == 0 || i == 0 || i == kentta.length -1 || j == kentta[i].length -1 ) {     //Kehykset
                kentta[i][j] = "X";
                }
                else {
                    kentta[i][j] = " ";
                }
            }
    
        }

        return kentta;

    }                                                           //pelialue loppuu

    public static String [][] pelaajanPaikka(String [][] a, int b, int c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (b - 1== j && c - 1 == i) {
                    a[i][j] = "P";
                    
                }
            }
    
        }
        return a;
    }

}