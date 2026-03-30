package pattern.Sorting.DivideAndConquer;

public class MergeSort { // TC == O(NLOGN) ,sc =0(n)
    public static void printarr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println(" ");
    }
    public static void mergesort(int[] arr, int si, int ei){ //recursive function
        if(si>=ei){
            return;
        }
        //kamm
        int mid = si+(ei-si)/2; //(si+ei)/2
        mergesort(arr,si,mid);  //left_side
        mergesort(arr,mid+1,ei); //Right_side part

        // Combine (The missing piece!)
        merge(arr, si, mid, ei);

    }
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp =new int[ei-si+1]; //+1 one necessary remember
        int i=si;         //iterator left part ke liye.
        int j =mid+1;     //iterator right part ke liye
        int k =0;         //temp array ke liye

        while (i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;     //k++;
            }else{
                temp[k]=arr[j];
                j++;     //k++;
            }k++;
        }
        //left part k liye
        while (i<=mid){
            temp[k++]=arr[i++];
        }

        // right part
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp ot original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,8,3,4,5};
        mergesort(arr,0, arr.length-1);
        printarr(arr);
    }
}
