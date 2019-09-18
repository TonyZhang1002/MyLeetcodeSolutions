package ProblemTest;

import Problems.Problem807;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test807 {
    Problem807 problem807 = new Problem807();

    @Test
    public void test1 () {
        assertEquals("Wrong", 35, problem807.maxIncreaseKeepingSkyline(new int[][] {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
    }
}
