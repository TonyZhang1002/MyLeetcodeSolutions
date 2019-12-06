package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem231;

public class Test231 {
    Problem231 problem231 = new Problem231();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", false, problem231.isPowerOfTwo(18));
    }
}
