package pattern.Recursion;

public class OptimizedXpowN {
    public static int optmpow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpow= optmpow(a,n/2);//TC=0(log n)
        int halfpowsq=halfpow*halfpow;
        if(n%2!=0){
            halfpowsq=a*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {

        System.out.println( optmpow(2,6));
    }
}
