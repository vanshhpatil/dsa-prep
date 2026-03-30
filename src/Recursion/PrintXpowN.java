package pattern.Recursion;

public class PrintXpowN {
    public static int power(int x,int n){
if(n==1){
    return x;
}
//int xnm1=power(x,n-1);
//int pow=x*xnm1;
//return pow;
        return x*power(x,n-1);
    }
    public static void main(String[] args) {

        System.out.println(power(2,5));
    }
}
