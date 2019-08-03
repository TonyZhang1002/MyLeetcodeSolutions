package ProblemTest;

import Problems.Problem824;
import Problems.Problem985;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Test985 {
    Problem985 problem985;

    @Before
    public void init() {
        problem985 = new Problem985();
    }

    @Test
    public void test1() {
        assertArrayEquals("Wrong", new int[] {8,6,2,4},
                problem985.sumEvenAfterQueries(new int[]{1, 2, 3, 4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}}));
    }

    @Test
    public void test2() {
        assertEquals("Wrong", 6, problem985.evenSumUP(new int[] {1, 2, 3, 4}));
    }
}
