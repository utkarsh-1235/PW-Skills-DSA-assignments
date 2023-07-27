
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
public class Question3 {
    
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;
    
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
    
            // Connect the remaining nodes from either list.
            if (l1 != null) {
                current.next = l1;
            } else if (l2 != null) {
                current.next = l2;
            }
    
            return dummyHead.next;
        }
    
        public static void main(String[] args) {
            // Example usage:
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(2);
            l1.next.next = new ListNode(4);
    
            ListNode l2 = new ListNode(1);
            l2.next = new ListNode(3);
            l2.next.next = new ListNode(4);
    
            Question3 solution = new Question3();
            ListNode mergedList = solution.mergeTwoLists(l1, l2);
    
            // Print the merged linked list.
            while (mergedList != null) {
                System.out.print(mergedList.val + " "); // Output: 1 1 2 3 4 4
                mergedList = mergedList.next;
            }
        }
    }
    

