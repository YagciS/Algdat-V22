package Tabell;

public class nestMaks {
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks.maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks.maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks.maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks.maks(a, 0, m);              // leter i a[0:m>
            int mh = maks.maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks


    /**
     * public static int[] nestMaks(int[] a)
     *   {
     *     if (a.length < 2) // må ha minst to verdier!
     *     throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");
     *
     *     int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi
     *
     *     Tabell.bytt(a,0,m);  // bytter om slik at den største kommer forrest
     *
     *     int k = Tabell.maks(a,1,a.length);
     *
     *     if (k == m) k = 0; // den nest største lå opprinnelig forrest
     *
     *     Tabell.bytt(a,0,m); // bytter tilbake
     *
     *     return new int[] {m,k};
     *
     *   } // nestMaks
     */

    /**
     *public static int[] nestMaks(int[] a)
     *   {
     *     if (a.length < 2) // må ha minst to verdier!
     *     throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");
     *
     *     int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi
     *
     *     Tabell.bytt(a,a.length-1,m);  // bytter om slik at den største kommer bakerst
     *
     *     int k = Tabell.maks(a,0,a.length-1);
     *
     *     if (k == m) k = a.length - 1; // den nest største lå opprinnelig bakerst
     *
     *     Tabell.bytt(a,a.length-1,m); // bytter tilbake
     *
     *     return new int[] {m,k};
     *
     *   } // nestMaks
     */
}
