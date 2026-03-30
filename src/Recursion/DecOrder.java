package pattern.Recursion;

public class DecOrder {
    public static void Decorder(int n){
        if(n==1){
            System.out.println(n);
            return ;//if statement jab execute hoga jab n==1
            // hoga direct return hoga no call to n-1;
        }
        System.out.print(n+" ");
        Decorder(n-1);
    }
    public static void main(String[] args) {
        int n=12;
        Decorder(n); 
    }
}
