package Tabell;

import java.util.NoSuchElementException;

public class maks {
    public static int maks(int[] a, int fra, int til) {
        if (a == null) throw new NullPointerException
                ("parametertabellen a er null!");

        fratilKontroll.fratilKontroll(a.length, fra , til);

        if (fra == til) throw new NoSuchElementException
                ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");


        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);     // kaller metoden over
    }
}
