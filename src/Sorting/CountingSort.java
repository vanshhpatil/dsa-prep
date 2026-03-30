package pattern.Sorting;

public class CountingSort {

    public static void Counting(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){       //original array pr iterate kr rhe h
        largest = Math.max(largest,arr[i]) ;
        }
        int count[]= new int[largest+1];
        for (int i = 0; i < arr.length; i++) { //count array pr iterate kr rhe h
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){    //rewrite with sorted order
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
     int[] arr ={1,4,3,2,5};
     Counting(arr);
            printArr(arr);
    }
}
