package pattern.Sorting.DivideAndConquer;

public class QuickSOrt {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
//recursive function banana hai
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int Pindex = partition(arr,si,ei);
        quickSort(arr,si,Pindex-1);//left part
        quickSort(arr,Pindex+1,ei); //right part ke liye
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot element;
        for (int j = si; j < ei; j++) { //j ki value zero se start nai krna hai partitions ki wajah se
            if(arr[j]<=pivot){
                i++;
                //swapp
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i]; //galti se bhi pivot = arr[i] nai likhna h , kyunki call by value hota h
        arr[i]=temp;


        return i;
    }

    public static void main(String[] args) {
        int[] arr ={6,3,9,8,2,5};
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
