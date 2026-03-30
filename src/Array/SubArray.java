package Array;

public class SubArray {
    public static void Subarray(int numbers[]){
        for(int i=0;i<numbers.length;i++){ //ye decide krta h array ka staring index...
int start=i;
for (int j=i;j< numbers.length;j++){ //ye decide krta h Sub-array ka ending index...
    int end=j;
    for(int k=start;k<=end;k++){
        System.out.print(numbers[k] +" ");//subArray
    }
    System.out.println();
}
System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7};
Subarray(numbers);
    }
}
