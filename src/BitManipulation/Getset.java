package pattern.BitManipulation;
import java.util.*;
public class Getset {
   public static void getter(int n){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the ith positon");
       int ith= sc.nextInt();
       int bitmask =1<<ith;
       System.out.println("Ith position is "+ (n&bitmask));
   }
    public static void main(String[] args) {
        getter(5);
        getter(4);
    }
}
