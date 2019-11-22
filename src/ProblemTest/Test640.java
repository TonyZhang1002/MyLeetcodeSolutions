package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem640;

public class Test640 {
    Problem640 problem640 = new Problem640();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", "x=2", problem640.solveEquation("x+5-3+x=6+x-2"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", "Infinite solutions", problem640.solveEquation("x=x"));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", "No solution", problem640.solveEquation("3x=3x+24"));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", "x=-1", problem640.solveEquation("2x+3x-6x=x+2"));
    }
}
