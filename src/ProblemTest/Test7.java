package ProblemTest;

import Problems.Problem7;
import org.junit.Assert;
import org.junit.Test;

public class Test7 {
    Problem7 problem7 = new Problem7();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", 342, problem7.reverse(243));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", 342, problem7.reverse(2430));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", -200342, problem7.reverse(-243002));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", 0, problem7.reverse(0));
    }

    @Test
    public void test5 () {
        Assert.assertEquals("Wrong", 0, problem7.reverse(1534236469));
    }

    @Test
    public void test6 () {
        Assert.assertEquals("Wrong", 0, problem7.reverse(1563847412));
    }
}
