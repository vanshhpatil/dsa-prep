package Array;

import java.util.*;

public class ArrCreation {
    public static void main(String[] args) {


    int arr[] = new int[5];

    System.out.println("Enter elements in Array");
    Scanner sc = new Scanner(System.in);

    arr[0]=sc.nextInt();
    arr[1]=sc.nextInt();

    System.out.println("1st position"+ arr[0] +"Second Position" +arr[1]);
}
}