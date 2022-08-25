public class finnMaksIndeks {
    /**
     * Lag en maks-metode som returnerer Indeks til
     * største element i intervallet [fra, til) for en tabell a
     */

     public static void main(String[] args) {
        int[] a = {2, 16, 5, 17, 13, 3};
        int maksVerdi = a[0];
        int maksIndeks = 0;
        //Løkken kjører fra 1--> lengden av a, hvis ny verdi er større enn maks, så er ny verdi maks.
        for (int i = 0; i < a.length; i++) {
            if (maksVerdi < a[i]) {
                maksVerdi = a[i];
                maksIndeks = i;
            }
        }
        System.out.print(maksIndeks);
    }
}
