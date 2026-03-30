package Array;

import java.util.*;
public class LinerSearch {
    public static int search(int num[], int key){
    for(int i=0;i<num.length;i++) {
        if (num[i] == key) {
            return i;
        }
    }
return -1;
    }
    public static void main(String args[]) {
        int num[]={1,2,3,4,5,6,7,9};
                int key =7;
                int index= search(num,key);
                if(index== -1){
                    System.out.println("KEY NOT FOUND");
                }else {
                    System.out.println("KEY FOUND ON INDEX :"+ index);
                }
    }
}
