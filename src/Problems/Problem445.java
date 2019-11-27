package Problems;

public class Problem445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reverseL1 = reverseListNode(l1);
        ListNode reverseL2 = reverseListNode(l2);
        ListNode answer = new ListNode(0);
        ListNode through = answer;
        boolean jw = false;
        while ((reverseL1 != null || reverseL2 != null) || jw) {
            int current = (reverseL1 == null ? 0 : reverseL1.val) + (reverseL2 == null ? 0 : reverseL2.val) + (jw ? 1 : 0);
            ListNode currentNode;
            if (current > 9) {
                currentNode = new ListNode(current - 10);
                jw = true;
            } else {
                currentNode = new ListNode(current);
                jw = false;
            }
            through.next = currentNode;
            through = through.next;
            if(reverseL1 != null)   reverseL1 = reverseL1.next;
            if(reverseL2 != null)   reverseL2 = reverseL2.next;
        }
        return reverseListNode(answer.next);
    }

    private ListNode reverseListNode (ListNode l) {
        ListNode prev = null;
        ListNode current = l;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
