package ProblemTest;

import Problems.Problem11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test11 {
    Problem11 problem11 = new Problem11();

    @Test
    public void test1() {
        assertEquals("Wrong", 49, problem11.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
