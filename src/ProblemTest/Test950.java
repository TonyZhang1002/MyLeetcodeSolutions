package ProblemTest;

import Problems.Problem950;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test950 {
    Problem950 problem950 = new Problem950();

    @Test
    public void test1() {
        assertArrayEquals("Wrong", new int[]{1,3,2}, problem950.deckRevealedIncreasing(new int[] {3,1,2}));
    }

    @Test
    public void test2() {
        assertArrayEquals("Wrong", new int[]{2,13,3,11,5,17,7},
                problem950.deckRevealedIncreasing(new int[] {17,13,11,2,3,5,7}));
    }
}
