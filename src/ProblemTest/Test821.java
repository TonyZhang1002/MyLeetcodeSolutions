package ProblemTest;

import Problems.Problem821;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test821 {
    Problem821 problem821 = new Problem821();
    int[] para = new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
    int[] para2 = new int[] {2, 1, 0, 1};

    @Test
    public void test1 () {
        assertArrayEquals("Wrong", para, problem821.shortestToChar("loveleetcode",'e'));
    }

    @Test
    public void test2 () {
        assertArrayEquals("Wrong", para2, problem821.shortestToChar("aaba",'b'));
    }
}
