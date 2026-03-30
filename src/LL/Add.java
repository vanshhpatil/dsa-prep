package LL;

public class Add{
    public static class Node {
        int data;
        Node nxt;
        public Node(int data) {  //constructor
            this.data = data;
            this.nxt = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            Node newNode = new Node(data); //step 1 creation
            size++;
            if(head==null){   //tail bhi kr sakte hai, pr by convention head null toh LL null mante
                head = tail = newNode;
                return;
            }
            newNode.nxt=head; //step 2
            head=newNode;     //step 3
    }
    public void addLast(int data){
        Node newNode = new Node(data); //step 1 creation
        size++;
            if (head ==null){
                head=tail=newNode;
            }
            tail.nxt=newNode;       //step 2
            tail=newNode;           //step 3
    }
    public static void print(){
               Node temp = head;
               while (temp!= null){
                   System.out.print(temp.data + "->");
                   temp=temp.nxt;
               }
        System.out.println("null");
    }

    public void addMiddle(int index,int data){
            if(index==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
        size++;
            Node temp = head;
            int i=0;
            while (i<index-1){
                temp = temp.nxt;
                i++;
            }
            //jab i ki value index-1 ke equal hogye soo
        newNode.nxt =temp.nxt;
            temp.nxt=newNode;
    }
    public int removeFirst(){
            if(size==0){
                System.out.println("List is empty");
                return Integer.MAX_VALUE;
            } else if (size==1) {
                int val = head.data;
                head=tail=null;
                size=0;
                return val;
            }
        int val = head.data;
            head=head.nxt;
            size++;
            return val;
    }
    public int removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        }
        if (head.nxt == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while (prev.nxt != tail) {
            prev = prev.nxt;
        }
        int val = tail.data;
        prev.nxt = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
     Add ad = new Add();
     ad.print();
     ad.addFirst(2);
        ad.print();
     ad.addFirst(1);
        ad.print();
     ad.addLast(4);
        ad.print();
     ad.addLast(5);   //constant TC - 0(1)
        ad.print();
     ad.addMiddle(2,3);  //TC - 0(n)
     ad.print();
        System.out.println(size);

     ad.removeFirst();
         ad.print();

     ad.removeLast();
         ad.print()   ;
    }
}
