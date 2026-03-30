package pattern.Recursion;

public class BinaryString {
    public static void binarypair(int n,int lastplace,String str){
        //base case hai.
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam hamara
            binarypair(n-1,0,str+"0");
        if(lastplace==0){
            binarypair(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
binarypair(3,0,"");
    }
}
