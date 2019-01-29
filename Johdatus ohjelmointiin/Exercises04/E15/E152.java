import java.util.*;

public class E152 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);

    int koko;
    String [] taulukko;
    boolean loppu = false;
    boolean vuoro = false; //onko O:n vuoro
    int valinta = 0;
    int pxp = 0;
    int pop = 0;
    
    System.out.print("Pelikentan koko : ");
    koko = syote.nextInt();
    taulukko = new String [koko];
    for (int i = 0; i < taulukko.length; i++) {     //laitetaan välilyänti soluihin eikä null
        taulukko[i] = " ";
    }
    syote.nextLine();   //nollataan scanneri;


        do {                                                //pelin alku

            for (int i = 0; i < taulukko.length; i++) {     //pelikentän printtaus
                System.out.print(" [ " +taulukko[i] +" ] ");
            }               

            for (int i = 0; i < taulukko.length; i++) {     //voittajan checkkaus

                    if (taulukko[i].equals("X")) {
                        pxp++;
                        pop = 0;
                    }
                    else if (taulukko[i].equals("O")) {
                        pop++;
                        pxp = 0;
                    }
                    else {
                        pxp = 0;
                        pop = 0;
                    }

                    if (pxp == 3) {
                        System.out.println("\n\nPELAAJA X VOITTAA!!!!!!\n");
                        loppu = true;
                    }
                    else if (pop == 3) {
                        System.out.println("\n\nPELAAJA O VOITTAA!!!!!!!!!!!111!1!\n");
                        loppu = true;
                    }

                }

            if (vuoro == false && loppu == false ) {
                System.out.println("\n\n Pista X ruutuun 1-"+taulukko.length);
                valinta = syote.nextInt(); 
                    taulukko[valinta - 1] = "X";
                    vuoro = true;
            }
            else if (vuoro == true && loppu == false) {
                System.out.println("\n\n Pista O ruutuun 1-"+taulukko.length);
                valinta = syote.nextInt();
                taulukko[valinta - 1] = "O";
                vuoro = false;
            }


        } while (loppu == false);    //pelin lopetus

    }
}