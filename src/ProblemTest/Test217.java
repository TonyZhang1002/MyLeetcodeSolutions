package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem217;

public class Test217 {
    Problem217 problem217 = new Problem217();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", true, problem217.containsDuplicate(new int[] {2,3,5,1,6,9,4,3}));
    }
}
