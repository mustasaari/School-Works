import java.util.*;



class E11 {

        static Scanner syote = new Scanner (System.in);
        static int playerx = 5;        //pelaajan x
        static int playery = 5;          //pelaajan y

    public static void main(String [] args) {
        int leveys;
        int korkeus;
        boolean end = false;
        do {
        System.out.println("Pelin leveys (min 10) : ");     //kysellään kentän koko
        leveys = syote.nextInt();
        } while (leveys < 10);
        do {
        System.out.println("Pelin korkeus (min 10) : ");
        korkeus = syote.nextInt();
        } while(korkeus < 10);
        String [][] theGame = new String [korkeus][leveys];



        do {
        theGame = peliAlue(theGame);    // pelin kehykset
        theGame = pelaajanPaikka(theGame, playerx, playery); 
        tulosta(theGame);
        getInput();

        
        } while (end == false);



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

    public static void getInput() {
        int contrl = 0;
        System.out.println("1. ylos 2.alas 3. vasen 4. oikea ");
        contrl = syote.nextInt();
        if (contrl == 1)
            playery--;
        if (contrl == 2)
            playery++;
        if (contrl == 3)
            playerx--;
        if (contrl == 4)
            playerx++;
    }

}