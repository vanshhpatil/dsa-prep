package pattern.Recursion;

public class FirstOccurance {
    public static int firstocr(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocr(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        System.out.println(  firstocr(arr,6,0));

    }//TC=O(n) sc=SAME
}
