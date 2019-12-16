package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem67;

public class Test67 {
    Problem67 problem67 = new Problem67();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", "100", problem67.addBinary("11", "1"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", "10101", problem67.addBinary("1010", "1011"));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", "1", problem67.addBinary("1", "0"));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", "101110", problem67.addBinary("101101", "1"));
    }
}
