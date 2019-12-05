package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem674;

public class Test674 {
    Problem674 problem674 = new Problem674();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", 1, problem674.findLengthOfLCIS(new int[] {2,2,2,2,2,2}));
    }
}
