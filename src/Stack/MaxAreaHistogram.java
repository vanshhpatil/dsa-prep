package Stack;
import java.util.*;

public class MaxAreaHistogram {
    public static void maxArea(int arr[]){
        int maxAreaa=0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        //for nsr
        for (int i =arr.length-1; i>=0; i--) {  //next greater left ke liye loop starting se.
            //while
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {  //next smaller ke liye >= condition
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //for nsl;
        s = new Stack<>();
        for (int i =0; i<arr.length ; i++) {  //next greater left ke liye loop starting se.
            //while
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {  //next smaller ke liye >= condition
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else
                nsl[i] = s.peek();
            s.push(i);
        }
        for (int i = 0; i < arr.length ; i++) {

            int h = arr[i];
            int w = nsr[i]-nsl[i]-1;
            int currArea = h*w;

          maxAreaa = Math.max(currArea,maxAreaa);
        }
        System.out.println("Maximum area is " + maxAreaa);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
