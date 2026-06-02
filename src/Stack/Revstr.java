package Stack;

import java.util.*;

public class Revstr {         //flipkart,amazon,adobe,paytm

    public static void revstr(Stack<Character> s ){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.push('a');
        s.push('b');
        s.push('c');

        revstr(s);
    }
}
