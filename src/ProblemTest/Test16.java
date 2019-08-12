package ProblemTest;

import Problems.Problem16;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test16 {
    Problem16 problem16 = new Problem16();

    @Test
    public void test1 () {
        assertEquals("Wrong", 16, problem16.threeSumClosest(new int[] {6, 7, 5, 4, 3, 2, 1}, 16));
    }
}
