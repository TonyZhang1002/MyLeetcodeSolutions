package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem796;

public class Test796 {
    Problem796 problem796 = new Problem796();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", true, problem796.rotateString("abcde", "cdeab"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", false, problem796.rotateString("abcde", "cdgab"));
    }
}
