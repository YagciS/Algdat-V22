import java.util.Arrays;

public class minMaksMetode {
    public static int[] minmaks(int[] a){
        if (a.length < 3)
            throw new java.util.NoSuchElementException("Tabellen er for kort!");

        int minIndeks = 0;
        int maksIndeks = 1;
        if (a[minIndeks] > a[maksIndeks]){
            minIndeks = 1;
            maksIndeks = 0;
        }

        for (int i = 2; i < a.length; i++){
            if (a[i] > a[maksIndeks]){
                maksIndeks = i;
            }
            else if(a[i] < a[minIndeks]){
                minIndeks = i;
            }
        }
        return new int[]{minIndeks, maksIndeks};
    }

    public static void main(String[] args){
        int[] array = {6, 2, 4, 1, 5};
        System.out.println(Arrays.toString(minmaks(array)));
    }
}
