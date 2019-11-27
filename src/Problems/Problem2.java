package Problems;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        boolean preAdd = false;
        while (l1 != null || l2 != null) {
            int thisNumber = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (preAdd ? 1 : 0);
            if (thisNumber >= 10) {
                preAdd = true;
                thisNumber -= 10;
            } else {
                preAdd = false;
            }
            pre.next = new ListNode(thisNumber);
            pre = pre.next;
            if (l1!=null)   l1 = l1.next;
            if (l2!=null)   l2 = l2.next;
        }
        if (preAdd) {
            pre.next = new ListNode(1);
        }
        return dummyHead.next;
    }
}

