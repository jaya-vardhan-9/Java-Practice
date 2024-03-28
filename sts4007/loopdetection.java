package sts4007;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class loopdetection {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, there can't be a loop.
        }

        ListNode slow = head;
        ListNode fast = head.next; // We start fast one step ahead to prevent early match if there's only one node in the loop.

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // If slow and fast pointers meet, there's a loop.
            }
            slow = slow.next; // Move slow pointer one step.
            fast = fast.next.next; // Move fast pointer two steps.
        }

        return false; // If fast reaches the end of the list, there's no loop.
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a loop

        System.out.println("Does the linked list have a loop? " + hasCycle(head));
    }
}
