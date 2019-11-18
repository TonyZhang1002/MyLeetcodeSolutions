package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem350;

public class Test350 {
    Problem350 problem350 = new Problem350();

    @Test
    public void test1 () {
        Assert.assertArrayEquals("Wrong", new int[] {4,9}, problem350.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }

    @Test
    public void test2 () {
        Assert.assertArrayEquals("Wrong", new int[] {2,2}, problem350.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
    }
}
