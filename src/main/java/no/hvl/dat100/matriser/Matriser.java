package no.hvl.dat100.matriser;

public class Matriser {

    // a) Skriver ut en todimensjonal tabell (matrise)
    public static void skrivUt(int[][] matrise) {

        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
         }
    }

    // b) Gjør matrisen om til en string
    public static String tilStreng(int[][] matrise) {
        String tekst = "";
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                tekst += matrise[i][j] + " ";
             }
            tekst += "\n";
        }
        return tekst;
    }

    // c) Multipliserer alle tall i matrisen med et gitt tall
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] ny = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                ny[i][j] = matrise[i][j] * tall;
             }
        }

        return ny;
    }

    // d) Sjekker om to matriser er like
    public static boolean erLik(int[][] mat1, int[][] mat2) {

        if (mat1.length != mat2.length) {
            return false;
            }

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false;
            }

            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
