package linkedlists;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList1 {
    Node head;
        void insert(int data){
          Node newNode = new Node(data);
          if(head == null){
            head = newNode;
          }
          else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
          }
        }

          void printdata(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
          
        
       }
       public static void main(String[] args) {
         LinkedList1 list = new LinkedList1();
         Scanner sc = new Scanner(System.in);
         int len = sc.nextInt();
         for(int i=0;i<len;i++){
            System.out.println("Insert val " + i);
            list.insert(sc.nextInt());
         }
         list.printdata();
         
       }
}
