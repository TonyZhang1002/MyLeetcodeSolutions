package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem13;

public class Test13 {
    Problem13 problem13 = new Problem13();

    @Test
    public void test1() {
        Assert.assertEquals("Wrong", 58, problem13.romanToInt("LVIII"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Wrong", 1994, problem13.romanToInt("MCMXCIV"));
    }
}
