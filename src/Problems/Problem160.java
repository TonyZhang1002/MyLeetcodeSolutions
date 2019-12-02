package Problems;

import java.util.HashSet;
import java.util.Set;

public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        Set<ListNode> Aset = new HashSet<>();
        ListNode throughA = headA;
        while (throughA != null) {
            Aset.add(throughA);
            throughA = throughA.next;
        }

        ListNode throughB = headB;
        while (throughB != null) {
            if (Aset.contains(throughB)) {
                return throughB;
            }
            else {
                throughB = throughB.next;
            }
        }
        return null;
    }
}
