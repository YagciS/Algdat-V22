package Tabell;

/**
 * Opg 1.2.1.1
 */
public class min {
    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }
        int m = fra;
        int minverdi = a[fra];

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;
                minverdi = a[m];
            }
        }
        return m;
    }
    public static int min(int[] a){ // Bruker hele tabellen
        return min(a, 0, a.length); //Kaller funksjonen over
    }
}
