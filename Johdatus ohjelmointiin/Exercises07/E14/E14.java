import java.util.*;



class E14 {

        static Scanner syote = new Scanner (System.in);
        static int playerx = 5;        //pelaajan x
        static int playery = 5;          //pelaajan y
        static int leveys;
        static int korkeus;
        static int score = 0;
        static int omenaMaara;
        static int vihuMaara;
        static boolean endi = false;

    public static void main(String [] args) {
        do {
        System.out.println("Pelin leveys (min 10) : ");     //kysellään kentän koko
        leveys = syote.nextInt();
        } while (leveys < 10);
        do {
        System.out.println("Pelin korkeus (min 10) : ");
        korkeus = syote.nextInt();
        } while(korkeus < 10);
        String [][] theGame = new String [korkeus][leveys];

        theGame = peliAlue(theGame);
        theGame = pelaajanPaikka(theGame,5, 5);
        theGame = omenointi(theGame);
        theGame = vihulaiset(theGame);

        do {
        theGame = peliAlue(theGame);    // pelin kehykset
        theGame = pelaajanPaikka(theGame, playerx, playery); 
        tulosta(theGame);
        getInput();


        
        } while (omenaMaara != score && endi == false);



    }

    public static void tulosta(String [][] myArray) {           //Tulostin

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nScore : "+score +"\n");
    }                                                           //Tulostin loppuu



    public static String [][] peliAlue(String [][] kentta) {     //pelialue alkaa

        for (int i = 0; i < kentta.length; i++) {
            for (int j = 0; j < kentta[i].length; j++) {
                if(j == 0 || i == 0 || i == kentta.length -1 || j == kentta[i].length -1 ) {     //Kehykset
                kentta[i][j] = "X";
                }
                else if (kentta[i][j] == "O") {             // <<<< --- estää omenoiden poistumisen
                    kentta[i][j] = "O";
                }
                else if (kentta[i][j] == "W") {             // estää W poistumisen
                    kentta[i][j] = "W";
                }
                else {
                    kentta[i][j] = " ";
                }
            }
    
        }

        return kentta;

    }                                                           //pelialue loppuu

    public static String [][] pelaajanPaikka(String [][] a, int b, int c) {
        if (a[c-1][b-1].equals("O")) {      //katsotaan onko omena ruudussa johon pelaaja on liikkumassa ja jos niin score +1
           score++;
        }
        if (a[c-1][b-1].equals("W")) {
            gameOver();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (b - 1== j && c - 1 == i) {
                    a[i][j] = "P";
                    
                }
            }
    
        }
        return a;
    }

    public static void getInput() {         //pelaajan liikkuminen
        if (endi == false) {
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

    public static String [][] omenointi(String [][] a) {
        omenaMaara = getRandom(1,4);             
        int laitetut = 0;
        int omppux = 0;
        int omppuy = 0;
        do {
                omppux = getRandom(2,leveys -2);
                omppuy = getRandom(2,korkeus -2);
                System.out.println("omppux:" +omppux +" omppuy: " +omppuy +"playerx: " +playerx +" playery" +playery);
                if (omppux +1 != playerx && omppuy +1 != playery && a[omppuy][omppux].equals(" ")) {        //checkataan ettei ole pelaajan positio eikä ole omenaa
                    a[omppuy][omppux] = "O";
                    laitetut++;
                }


        } while (laitetut != omenaMaara);

        return a;
    }

    public static String [][] vihulaiset(String [][] a) {
        vihuMaara = getRandom (1,3);
        int laitetut = 0;
        int vihux;
        int vihuy;
        do {
            vihux = getRandom(2, leveys-2);
            vihuy = getRandom(2, korkeus-2);
            if (a[vihuy][vihux].equals(" ")) {
                a[vihuy][vihux] = "W";
                laitetut++;
            }
        } while (laitetut != vihuMaara);
        return a;

    }




    public static int getRandom(int min, int max) {     // random generaattori
        double palaute;
        do {
            palaute = Math.random()*max +1;     
        } while (palaute < min);
        return (int)palaute;
    } 

    public static void gameOver() {
        System.out.println ("GAME OVER");
        endi = true;
    }

}