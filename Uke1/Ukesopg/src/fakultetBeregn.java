//Oppgave 1.
public class fakultetBeregn {
    public static long fak(int n) {
        int sum = n;
        while (n - 1 > 1) {
            sum *= n - 1;
            n--;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fak(n));
    }
}
