package pattern.BitManipulation;

public class Bit {
    public static void checkno(int n){
        int bitmask=1;
        if((n&bitmask)==1){
            System.out.println("the number is ODD");
        }else{
            System.out.println("the number is EVEN");
        }
    }
    public static void main(String[] args) {
        checkno(4);
        checkno(6);
        checkno(10);
        checkno(57);
    }
}
