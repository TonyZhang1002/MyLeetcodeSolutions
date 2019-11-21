package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem592;

public class Test592 {
    Problem592 problem592 = new Problem592();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", "0/1", problem592.fractionAddition("-1/2+1/2"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", "-1/6", problem592.fractionAddition("1/3-1/2"));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", "2/1", problem592.fractionAddition("-5/2+10/3+7/9"));
    }
}
