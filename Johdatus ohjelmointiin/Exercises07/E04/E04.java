import java.util.*;



class E04 {
    public static void main(String [] args) {
        Scanner syote = new Scanner (System.in);

        int [][] taulukko = {{1,3,9}, {2,7,3}};


        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                 System.out.print("Rivi "+i +" Sarake " +j +" : ");
                taulukko[i][j] = syote.nextInt();
            }
            System.out.println();
        }




        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                 System.out.print(taulukko[i][j] +" ");
            }
            System.out.println();
        }

    }

}