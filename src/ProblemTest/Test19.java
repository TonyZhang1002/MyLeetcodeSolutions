package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem19;

public class Test19 {
    Problem19 problem19 = new Problem19();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", true, problem19.isHappy(19));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", true, problem19.isHappy(7));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", false, problem19.isHappy(2));
    }
}
