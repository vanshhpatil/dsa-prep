package Array;
import java.util.*;
public class BinarySearch {
    public static int binaryNo(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){  //right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1;
    }


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
        System.out.println("Enter Key in Array :");
        int key=sc.nextInt();
       int binary= binaryNo(numbers,key);
       if(binary == -1){
           System.out.println("The key"+key+"was not found");
       }else{
           System.out.println("Index of the key "+key+" is" + binary);
       }

    }
}
