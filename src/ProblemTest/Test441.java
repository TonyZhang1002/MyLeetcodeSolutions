package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem441;

public class Test441 {
    Problem441 problem441 = new Problem441();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", 1, problem441.arrangeCoins(2));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", 3, problem441.arrangeCoins(8));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", 60070, problem441.arrangeCoins(1804289383));
    }
}
