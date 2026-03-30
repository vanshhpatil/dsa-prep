package pattern.Recursion;

public class SortedArray {
    public static boolean sortedarr(int[] arr, int i){
        if(i==arr.length-1){
            return true;}
            if (arr[i]>arr[i+1]){
                return false;
            }
        return sortedarr(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,6  };
        System.out.println(sortedarr(arr,0));
    }
}
