
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question4 {
    
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false; // An empty or single-node list cannot have a cycle.
            }
    
            ListNode slow = head;
            ListNode fast = head;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
    
                if (slow == fast) {
                    return true; // The fast pointer caught up to the slow pointer, indicating a cycle.
                }
            }
    
            return false; // If the loop terminates, there is no cycle in the list.
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode head = new ListNode(3);
            head.next = new ListNode(2);
            head.next.next = new ListNode(0);
            head.next.next.next = new ListNode(-4);
    
            // Create a cycle by connecting the last node to the second node.
            head.next.next.next.next = head.next;
    
            Question4 solution = new Question4();
            boolean hasCycle = solution.hasCycle(head);
            System.out.println("Has Cycle: " + hasCycle); // Output: true
        }
    }
    

