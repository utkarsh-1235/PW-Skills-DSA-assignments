
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    

public class Question1{    
        public ListNode deleteNode(ListNode head, int target) {
            if (head == null) {
                return null; // If the list is empty, return null.
            }
    
            // If the target node is the head node, update the head and return.
            if (head.val == target) {
                return head.next;
            }
    
            ListNode prev = head;
            ListNode curr = head.next;
    
            while (curr != null) {
                if (curr.val == target) {
                    prev.next = curr.next; // Update the pointers to remove the node.
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
    
            return head;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
    
            Question1 solution = new Question1();
            int target = 2;
            ListNode newHead = solution.deleteNode(head, target);
    
            // Print the updated linked list.
            while (newHead != null) {
                System.out.print(newHead.val + " "); // Output: 1 3
                newHead = newHead.next;
            }
        }
    }
    
