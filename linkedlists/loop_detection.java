
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }

    
}

public class loop_detection {

    public static boolean hasCycle(ListNode head){
        if(head == null || head.next ==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(head != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String args[]){

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = head.next.next.next;  // this line tells lopp detection

        boolean z = hasCycle(head);
        
        System.out.println(z);

    }
}
