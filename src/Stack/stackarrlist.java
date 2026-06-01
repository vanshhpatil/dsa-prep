package Stack;
import java.util.ArrayList;
public class stackarrlist {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;  //jab list ka sizwe zero means stack mein ek bhi elemnt nai h,return true
        }

        //push_fxn
        public static void push(int data) {
            list.add(data);
        }

        //pop fxn
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);   //get store   0(1)
            list.remove(list.size() - 1);    //removee       "
            return top;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);   //get store   0(1)
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) { //jabtak isEmpty true return nai krta
            System.out.println(s.peek());
            s.pop();
        }
    }
}
