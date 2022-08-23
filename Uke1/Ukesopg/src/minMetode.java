public class minMetode {
    public static int min(int[] a){
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for min)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[m]) {
                m = i;  // indeksen oppdateres
            }
            /** 1.1.2 - Oppgave 3
             * if (a[i] <= a[m]){
             *      m = i;
             * }
             */
        }

        return m;  // returnerer indeksen/posisjonen til minste verdi

    }
    public static void main(String[] args){
        int[] array = {6, 2, 4, 1, 5};
        System.out.println(min(array));
        //Vil returnere 3
    }
}
