import java.util.*;

class E11 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        //System.out.println (getRandom ( 2, 715));
        int rahat = 25;
        int panos;

        do {
            String rullat [] = rullaus(); 
            System.out.print ("Rahaa on sulla : " +rahat +"\nPanos : ");        //rahatilanne ja panos. nolla panos lopettaa
            panos = syote.nextInt();
            System.out.println ("\n\n[ " +rullat[0] +" ]  [ " +rullat[1]+" ]  [ " +rullat[2]+" ]\n\n");
            rahat = rahat - panos;
            rahat += panos * tarkastus(rullat);
        } while (rahat > 0 && panos != 0);

    }
    
    public static String[] rullaus() {          //Tarkastaa onko samoja kuvioita
        String palautus[] = {" "," "," "};
        int rndLuku;
        for(int i = 0; i < 3; i++) {
            rndLuku = myMath.getRandom(0,3);
            //System.out.println("randomi oli : " +rndLuku);  //debug
            switch (rndLuku) {
                case 0: palautus[i] = "A";
                break;
                case 1: palautus[i] = "K";
                break;
                case 2: palautus[i] = "Q";
                break;
                case 3: palautus[i] = "J";
                break;
            }
        }
        return palautus;
    }

    public static int tarkastus(String [] a) {
        if(a[0].equals(a[1]) && a[1].equals(a[2]) ) {       //rivin tarkastus ja voittokerroin
            System.out.println("WINNER!!!!");
            switch (a[0]) {
                case "J": return 3;
                case "Q": return 4;
                case "K": return 5;
                case "A": return 6;
            }
        }


        return 0;
    }

}


class myMath {

    public static int getRandom(int min, int max) {     // random metodi alkaa
        double palaute;
        do {
        palaute = Math.random()*max +1;     
        } while (palaute < min);
        //System.out.println((int) palaute);
        return (int)palaute;
    }  

}