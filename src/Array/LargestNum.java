package Array;
import java.util.*;
public class LargestNum {
    public static int largestArr(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
        if(number[i]>largest){
            largest=number[i];

        }
    }
        return largest;
    }

    public static void main(String[] args) {
        int number[]=new int[10];
        System.out.println("Enter number of ELEMENTs in array :");
        Scanner sc = new Scanner(System.in);
        int ele=sc.nextInt();
        System.out.println("Enter number ELEMENTs of array :");
        for (int i=0;i<ele;i++ ){
            number[i]=sc.nextInt();
        }
        int large=largestArr(number);
        System.out.println("Largest number in the array is :"+ large);
    }
}


//smallest