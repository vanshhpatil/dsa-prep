package Stack;

import java.sql.SQLOutput;
import java.util.*;
public class Revstr {
public static void strrev(String st) {
    Stack<Character> s = new Stack<>();
    int idx = 0;  //bateyga konse index pr h
    while (idx < st.length()) {
        s.push(st.charAt(idx));
        idx++;
    }
    StringBuilder res = new StringBuilder("");
    while(!s.isEmpty()){
        char curr = s.pop();
        res.append(curr);
    }
    st = res.toString();
    System.out.println(st);
}


    public static void main(String[] args) {
        strrev("ABC");

    }
}


//public class Revstr {         //flipkart,amazon,adobe,paytm
//
//    public static void revstr(Stack<Character> s ){
//        while(!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }
//    public static void main(String[] args) {
//        Stack<Character> s = new Stack<>();
//        s.push('a');
//        s.push('b');
//        s.push('c');
//
//        revstr(s );
//    }
//}
