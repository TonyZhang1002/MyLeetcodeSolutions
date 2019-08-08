package ProblemTest;

import Problems.Problem496;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test496 {
    Problem496 problem496 = new Problem496();

    @Test
    public void test1() {
        assertArrayEquals("Wrong", new int[] {-1,3,-1},
                problem496.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2}));
    }

    @Test
    public void test2() {
        assertArrayEquals("Wrong", new int[] {3,-1},
                problem496.nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4}));
    }
}
