
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question8 {
    
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head; // No change needed for an empty list or a list with a single node.
            }
    
            ListNode oddHead = head;
            ListNode evenHead = head.next;
            ListNode odd = oddHead;
            ListNode even = evenHead;
    
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
    
            odd.next = evenHead; // Connect odd list to even list.
    
            return oddHead;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            Question8 solution = new Question8();
            ListNode newHead = solution.oddEvenList(head);
    
            // Print the reordered linked list.
            while (newHead != null) {
                System.out.print(newHead.val + " "); // Output: 1 3 5 2 4
                newHead = newHead.next;
            }
        }
    }
    

