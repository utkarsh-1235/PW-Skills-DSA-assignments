
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question2 {
    
        public ListNode removeElements(ListNode head, int val) {
            // Handle the case where the list is empty or only has one node.
            if (head == null) {
                return null;
            }
    
            // Remove any leading nodes with the target value.
            while (head != null && head.val == val) {
                head = head.next;
            }
    
            ListNode prev = null;
            ListNode curr = head;
    
            // Traverse the list and remove nodes with the target value.
            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                } else {
                    prev = curr;
                }
                curr = curr.next;
            }
    
            return head;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(6);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next.next = new ListNode(6);
    
            int target = 6;
    
            Question2 solution = new Question2();
            ListNode newHead = solution.removeElements(head, target);
    
            // Print the updated linked list.
            while (newHead != null) {
                System.out.print(newHead.val + " "); // Output: 1 2 3 4 5
                newHead = newHead.next;
            }
        }
    }
    

