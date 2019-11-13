package ProblemTest;

import Problems.Problem1108;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1108 {
    Problem1108 problem1108 = new Problem1108();

    @Test
    public void test1() {
        assertEquals("Wrong", "1[.]1[.]1[.]1", problem1108.defangIPaddr("1.1.1.1"));
    }
}
