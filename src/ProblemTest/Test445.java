package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.ListNode;
import Problems.Problem445;

public class Test445 {
    Problem445 problem445 = new Problem445();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", buildListNode(new int[] {7,8,0,7}), problem445.addTwoNumbers(
                buildListNode(new int[] {5}), buildListNode(new int[] {5})));
    }

    private ListNode buildListNode (int[] a) {
        return getListNode(a);
    }
}
