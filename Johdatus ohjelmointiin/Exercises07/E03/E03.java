import java.util.*;



class E03 {
        public static void main(String [] args) {

            int [][] taulukko = {{1,3,9}, {2,7,3}};

            for (int i = 0; i < taulukko.length; i++) {
                for (int j = 0; j < taulukko[i].length; j++) {
                    System.out.print(taulukko[i][j] +" ");
                }
                System.out.println();
            }

        }

}