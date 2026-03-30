package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;   // outer loop mein index rakhna hai
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {  // yaha correction
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {   // yaha bhi correction (n-1 ki jagah n tak loop)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 3, 2, 1};
        Selection(arr);
        printArr(arr);
    }
}
