import java.util.Arrays;

public class finnStørstOgNest {
    public static int maks(int[] a, int fra, int til){
        int mix = fra;
        int maksverdi = a[fra];
        for (int i = fra + 1; i < til; i++){
            if (a[i] > maksverdi){
                mix = i;
                maksverdi = a[mix];
            }
        }
        return mix;
    }

    public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args){
        int[] a = {2, 16, 5, 17, 13, 3};

        int mix = maks(a, 0, a.length);
        bytt(a, 0, mix);
        int nmix = maks(a, 1, a.length);
        if (nmix == mix){
            nmix = 0;
        }
        bytt(a, 0, mix);
        System.out.println(Arrays.toString(a));
        System.out.println(mix);
        System.out.println(nmix);
    }

}
