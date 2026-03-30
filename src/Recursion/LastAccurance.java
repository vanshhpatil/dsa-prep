package pattern.Recursion;

public class LastAccurance {
    public static int Lastocr(int arr[],int key,int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound= Lastocr(arr,key,i+1);
        if(isFound==-1&&arr[i]==key){
            return i;
        }else {
            return isFound;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,1,0,5};
        System.out.println(  Lastocr(arr,2,0));

    }//TC=O(n) sc=SAME
}
