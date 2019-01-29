import java.util.*;

class E16 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        System.out.println ("Syota alueen koko : ");
        int muuttuja = syote.nextInt();
        String taulukko [] = new String [muuttuja];
        int arvaus = 0;

        for (int i = 0; i < taulukko.length ; i++) {    //pommit taulukkoon
            muuttuja = getRandom(1,100);
            if (muuttuja < 30) {
                taulukko[i] = "B";  //Bomb
            }
            else {
                taulukko[i] = " ";  //Empty
            }
        }

        for (int i = 0; i < taulukko.length; i++) {     //printataan tyhja taulu
            System.out.print("[X]  ");
            //System.out.print(" [" +taulukko[i] +"] ");    //debug
        }

        System.out.println("\n\nPoimi kortti 1 - " +taulukko.length);       //tassa suoritetaan arvaus
        arvaus = syote.nextInt();

        taulukko[arvaus-1] += "P";  //taulukkoon minkä pelaaja valitsi

        for (int i = 0; i < taulukko.length; i++) {     //tässä tulostetaan taulukko auki
        System.out.print("[" +taulukko[i] +"]  ");
        }

        if (taulukko[arvaus-1].equals("B")) {
            System.out.println("\n\nLOSE!\n");
        }
        else {
            System.out.println("\n\nWINS!\n");
        }



    }

    public static int getRandom(int min, int max) {     // getRandom metodi alkaa //getRandom ( 3, 9)
        double palaute;
        palaute = Math.random()*(max-min+1) +min;     
        return (int)palaute;
    }                                                   // random metodi loppuu
}