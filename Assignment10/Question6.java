
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question6 {
    
        public ListNode leftShift(ListNode head, int k) {
            if (head == null || k == 0) {
                return head; // No shift needed if the list is empty or k is 0.
            }
    
            // Calculate the length of the linked list.
            int length = 1;
            ListNode tail = head;
            while (tail.next != null) {
                tail = tail.next;
                length++;
            }
    
            // Calculate the actual shift count.
            k %= length;
    
            if (k == 0) {
                return head; // No shift needed if k is a multiple of the list length.
            }
    
            // Find the new head and the new tail of the linked list after shifting.
            ListNode newTail = head;
            for (int i = 1; i < length - k; i++) {
                newTail = newTail.next;
            }
    
            ListNode newHead = newTail.next;
            newTail.next = null;
            tail.next = head;
    
            return newHead;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(2);
            head.next = new ListNode(4);
            head.next.next = new ListNode(7);
            head.next.next.next = new ListNode(8);
            head.next.next.next.next = new ListNode(9);
    
            int k = 3;
    
            Question6 solution = new Question6();
            ListNode newHead = solution.leftShift(head, k);
    
            // Print the updated linked list.
            while (newHead != null) {
                System.out.print(newHead.val + " "); // Output: 8 9 2 4 7
                newHead = newHead.next;
            }
        }
    }
    

