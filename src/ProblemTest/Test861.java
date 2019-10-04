package ProblemTest;

import Problems.Problem861;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test861 {
    Problem861 problem861 = new Problem861();

    @Test
    public void test1 () {
        assertEquals("Wrong", 39,
                problem861.matrixScore(new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
    }
}
