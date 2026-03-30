package pattern.Sorting;
import java.util.Arrays;

public class InbuiltSort {
    public static void printarr(Integer arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[]={2,5,4,3,1};
        Arrays.sort(arr,0,3);
        printarr(arr);
    }
}
