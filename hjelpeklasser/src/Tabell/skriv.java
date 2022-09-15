package Tabell;

public class skriv {
    public static void skriv(int[] a, int fra, int til)
    {
        fratilKontroll.fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }

    public static void skriv(int[] a)
    {
        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til)
    {
        skriv(a,fra,til);
        System.out.println();
    }

    public static void skrivln(int[] a)
    {
        skrivln(a, 0, a.length);
    }
    public static void skriv(char[] c, int fra, int til)
    {
        fratilKontroll.fratilKontroll(c.length,fra,til);

        for (int i = fra; i < til; i++) System.out.print(c[i] + " ");
    }

    public static void skrivln(char[] c, int fra, int til)
    {
        fratilKontroll.fratilKontroll(c.length,fra,til);

        for (int i = fra; i < til; i++) System.out.print(c[i] + " ");
        System.out.println();
    }
}
