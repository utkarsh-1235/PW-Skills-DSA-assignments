import java.util.HashMap;


    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question7 {

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode current = dummyHead;
        int sum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();

        while (current != null) {
            sum += current.val;

            if (map.containsKey(sum)) {
                ListNode prev = map.get(sum).next;
                int tempSum = sum + prev.val;
                while (prev != current) {
                    map.remove(tempSum);
                    prev = prev.next;
                    tempSum += prev.val;
                }
                map.get(sum).next = current.next;
            } else {
                map.put(sum, current);
            }

            current = current.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);

      Question7 solution = new Question7();
        ListNode newHead = solution.removeZeroSumSublists(head);

        // Print the updated linked list.
        while (newHead != null) {
            System.out.print(newHead.val + " "); // Output: 3 1
            newHead = newHead.next;
        }
    }
}


