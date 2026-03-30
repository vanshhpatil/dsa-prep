package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    };
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of element in Array :");
        int ele= sc.nextInt();
        int numbers[] = new int[ele];
        System.out.println("Elements in Array are :");
        for(int i=0;i<ele;i++){
            numbers[i]= sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Array After Sorting");
        for(int i=0;i<ele;i++){
            System.out.print(numbers[i]+ " " );
        }
        System.out.println("");

        reverse(numbers);
        System.out.print("Reverse of array is :");
        for(int i=0;i<ele;i++){
            System.out.print( numbers[i] + " ");
        }
    }

}
