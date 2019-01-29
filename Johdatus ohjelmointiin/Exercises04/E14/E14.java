import java.util.*;

public class E14 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

    double rndluku;
    int arvaus;
    int [] taulukko;
    taulukko = new int [100];

    for (int i = 0; i < taulukko.length; i++) {
        rndluku = Math.random()*100+1;
        taulukko[i] = (int) rndluku;
        //System.out.println("alkio "+i +" - " +taulukko[i]);  //tulostaa tarvittaessa taulukon arvot
    }

    System.out.print("Arvaa luku 1-100 : ");
    arvaus = syote.nextInt();

    for (int i = 0; i < taulukko.length; i++) {
        if (taulukko[i] == arvaus) {
            System.out.println("oikea arvaus taulukon kohdassa : " +i);
            i = taulukko.length;
        }
        else {
            //System.out.println("nope " +i);
        }
    }

    }
}