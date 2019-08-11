package ProblemTest;

import Problems.Problem1089;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test1089 {
    Problem1089 problem1089 = new Problem1089();
    int[] para = new int[] {1,0,0,2,3,0,0,4};
    int[] para2 = new int[] {0,0,0,0,0,0,0};

    @Test
    public void test1 () {
        assertArrayEquals("Wrong", para,
                problem1089.duplicateZeros(new int[] {1,0,2,3,0,4,5,0}));
    }

    @Test
    public void test2 () {
        assertArrayEquals("Wrong", para,
                problem1089.duplicateZeros(new int[] {0,0,0,0,0,0,0}));
    }
}
