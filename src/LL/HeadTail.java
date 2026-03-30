package LL;

public class HeadTail {

    public static class Node{
        int data;
        Node nxt;

        public Node( int data){
            this.data=data;
            this.nxt =null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
HeadTail ht =new HeadTail();
ht.head = new Node(1);
ht.head.nxt=new Node(2);

        System.out.println(head);

    }
}
