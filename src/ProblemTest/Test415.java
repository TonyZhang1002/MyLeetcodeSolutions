package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem415;

public class Test415 {
    Problem415 problem415 = new Problem415();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", "5", problem415.addStrings("2", "3"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", "0", problem415.addStrings("0", "0"));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", "149786", problem415.addStrings("54621", "95165"));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", "78086", problem415.addStrings("54621", "23465"));
    }
}
