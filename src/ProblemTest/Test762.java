package ProblemTest;

import Problems.Problem762;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test762 {
    Problem762 problem762 = new Problem762();

    @Test
    public void test1() {
        assertEquals("Wrong", 4, problem762.countPrimeSetBits(6,10));
    }

    @Test
    public void test2() {
        assertEquals("Wrong", 5, problem762.countPrimeSetBits(10,15));
    }
}
