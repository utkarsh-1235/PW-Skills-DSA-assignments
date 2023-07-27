
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question5 {
    
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
    
            ListNode fast = dummyHead;
            ListNode slow = dummyHead;
    
            // Move the fast pointer n steps ahead.
            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }
    
            // Move both pointers until the fast pointer reaches the end.
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
    
            // Remove the nth node by updating the pointers.
            slow.next = slow.next.next;
    
            return dummyHead.next;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            int n = 2;
    
            Question5 solution = new Question5();
            ListNode newHead = solution.removeNthFromEnd(head, n);
    
            // Print the updated linked list.
            while (newHead != null) {
                System.out.print(newHead.val + " "); // Output: 1 2 3 5
                newHead = newHead.next;
            }
        }
    }
    

