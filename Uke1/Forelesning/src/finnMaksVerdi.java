public class finnMaksVerdi {
    public static void main(String[] args){
        int[] a = {2, 12, 5, 7, 13, 3};
        int maks = a[0]; //Starter fra indeks 0
        //Løkken kjører fra 1--> lengden av a, hvis ny verdi er større enn maks, så er ny verdi maks.
        for (int i = 1; i < a.length; i++){
            if (maks < a[i]){
                maks = a[i];
            }
        }
        System.out.print(maks);
    }
}
/**
 * Telleoperasjoner:
 * Linje 4: En tilordning og en indeksering (2) (2)
 * Linje 6: En tilordning og 6 sammenligning og 5 inkrementer (12) (1+n+(n-1))
 * Linje 7: (En sammenligning og en indeksering)*5 (antall regneoperasjoner) (10) (2(n-1))
 * Linje 8: (En tilordning og en indeksering)*2 (4) (2x)
 * Tilsammen (2+12+10+4=28)
 *
 * 2+ 1+n+(n-1) + 2(n-1) + 2x
 * = 4n+2x
 * n=6, x=2
 * = (4*6)+(2*2) = 24+4 = 28
 **/