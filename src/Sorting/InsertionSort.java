package Sorting;

public class InsertionSort {
public static void insertion(int arr[]){
    for(int i=1;i<arr.length-1;i++){
        int curr=arr[i];
        int prev=arr[i-1];
        while((prev >= 0) && (arr[prev] > curr)){
            arr[prev+1]=arr[prev];
            prev--;
        }
    }
}
    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {   // yaha bhi correction (n-1 ki jagah n tak loop)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr ={5,4,3,6,7,1,2};
        insertion(arr);
        printArr(arr);
    }
}
