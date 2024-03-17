package linkedlists;
//creating node
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {

    Node head = new Node(8);
    Node second = new Node(3);
    Node third = new Node(6);
    Node fourth = new Node(9);

    head.next = second;
    second.next = third;
    third.next = fourth;
  
    Node curr = head;
    while(curr!=null){
        System.out.println(curr.data);
        curr = curr.next;
    }
    }
 
}
