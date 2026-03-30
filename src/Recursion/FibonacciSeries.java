package pattern.Recursion;

public class FibonacciSeries {
    public static int series(int n){
        if (n==0||n==1){
            return n;
        }
        int fsnm1=series(n-1);
        int fsnm2=series(n-2);
        int fb= fsnm1+fsnm2;
        return fb;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(series(n));
    }
}
