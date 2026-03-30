package pattern.TwoDArray;
import java.util.*;
public class TwoDcreation {
    public static boolean printMat(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                if(arr[i][j]==key){
                    System.out.println("Key Found at position :" + i +","+j );
                    return true;
                }
            }
    }

        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args) {
        int[][] arr =new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matix element Value :");


        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
    }
        printMat(arr,8);
    }
}
