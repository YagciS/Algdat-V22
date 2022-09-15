import static Tabell.randPerm.*;
import static Tabell.maks.*;

public class Program {
    public static void main(String ... args)      // hovedprogram
    {
        int[] a = randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

    } // main
}
