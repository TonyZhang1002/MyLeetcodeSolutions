package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem33;

public class Test33 {
    Problem33 problem33 = new Problem33();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", -1, problem33.search(new int[] {4,5,6,7,0,1,2}, 3));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", -1, problem33.search(new int[] {4,5,6,7,9,13,16,0,1,2}, 11));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", 6, problem33.search(new int[] {4,5,6,7,9,13,16,0,1,2}, 16));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", 9, problem33.search(new int[] {4,5,6,7,9,13,16,0,1,2}, 2));
    }

    @Test
    public void test5 () {
        Assert.assertEquals("Wrong", 0, problem33.search(new int[] {2}, 2));
    }

    @Test
    public void test6 () {
        Assert.assertEquals("Wrong", 0, problem33.search(new int[] {4,5,6,7,9,13,16,0,1,2}, 4));
    }

    @Test
    public void test7 () {
        Assert.assertEquals("Wrong", 0, problem33.search(new int[] {4,5}, 4));
    }

    @Test
    public void test8 () {
        Assert.assertEquals("Wrong", 1, problem33.search(new int[] {4,5}, 5));
    }

    @Test
    public void test9 () {
        Assert.assertEquals("Wrong", -1, problem33.search(new int[] {5,4}, 7));
    }

    @Test
    public void test10 () {
        Assert.assertEquals("Wrong", 3, problem33.search(new int[] {1,2,3,4,5,6}, 4));
    }

    @Test
    public void test11 () {
        Assert.assertEquals("Wrong", 3, problem33.search(new int[] {6,5,4,3,2,1}, 3));
    }

}
