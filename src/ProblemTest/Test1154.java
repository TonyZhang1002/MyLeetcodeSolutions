package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem1154;

public class Test1154 {
    Problem1154 problem1154 = new Problem1154();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", 9, problem1154.dayOfYear("2019-01-09"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", 41, problem1154.dayOfYear("2019-02-10"));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", 60, problem1154.dayOfYear("2003-03-1"));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", 364, problem1154.dayOfYear("1961-12-30"));
    }
}
