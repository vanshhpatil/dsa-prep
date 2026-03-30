package Array;

public class MaxSumSubarray {
    public static void MaxSubarray(int numbers[]){
        int currSum= 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){ //ye decide krta h array ka staring index...
            int start=i;
            for (int j=i;j< numbers.length;j++){ //ye decide krta h Sub-array ka ending index...
                int end=j;
                currSum=0; //double se assign krna hoga kyunki value change ho jaygi 
                for(int k=start;k<=end;k++){
                   currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum <currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum =" + maxSum );
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        MaxSubarray(numbers);
    }
}
