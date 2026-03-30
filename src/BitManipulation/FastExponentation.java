package pattern.BitManipulation;
import java.util.*;
public class FastExponentation {
    public static int fastExpo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int a= sc.nextInt();
        System.out.println("Enter Power");
        int p= sc.nextInt();
        int ans = 1;
        while (p > 0) {
            if ((p & 1) != 0) { ///LSB ke liye check kr rhe h
                ans = ans * a;
            }
            a = a * a;
            p=p>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo());
    }
}
