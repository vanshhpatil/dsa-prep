package Arraylist;

import java.util.ArrayList;

public class MaxNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(7);

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(max< list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
