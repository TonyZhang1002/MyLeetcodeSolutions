package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem219;

public class Test219 {
    Problem219 problem219 = new Problem219();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", true, problem219.containsNearbyDuplicate(new int[] {4,5,7,5,8,1,3}, 3));
    }
}
