package pattern.Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;//base condition toh dena hi hoga
        }//O(n) is time complexity,SC=O(n)
        int fnm1=fact(n-1);
        return n*fnm1;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(fact(n));
    }
}