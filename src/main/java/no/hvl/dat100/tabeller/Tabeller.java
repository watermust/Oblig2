package no.hvl.dat100.tabeller;

public class Tabeller {

    // a) tabell med heltall
    public static void skrivUt(int[] tabell) {

        for (int tall : tabell) {
            System.out.print(tall + " ");
        }
        System.out.println();
     }

    // b) lager en string med alle tall i tabellen
    public static String tilStreng(int[] tabell) {
        String tekst = "[";
        for (int i = 0; i < tabell.length; i++) {
            tekst += tabell[i];
            if (i < tabell.length - 1) {
                tekst += ",";
            }
        }
        tekst += "]";
        return tekst;
     }

    // c) Summerer tallene i tabellen
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;
        }
        return sum;
     }

    // d) Sjekker om et tall finnes i tabellen
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int t : tabell) {
            if (t == tall) {
                return true;
            }
         }
        return false;
    }

    // e) Finner posisjonen til et tall
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
     }

    // f)
    public static int[] reverser(int[] tabell) {
        int[] ny = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            ny[i] = tabell[tabell.length - 1 - i];
        }
        return ny;
     }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
         }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] ny = new int[tabell1.length + tabell2.length];
        int i = 0;


        for (int tall : tabell1) {
            ny[i] = tall;
            i++;
         }


        for (int tall : tabell2) {
            ny[i] = tall;
            i++;
        }

        return ny;
    }
 }
