package pattern.Recursion;

public class sumNatural {
    public static int printN(int n){
        if(n==1){
            return 1;
        }
        int sumNm1=printN(n-1);
        int sum=n+sumNm1;
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(printN(n));
    }
}
