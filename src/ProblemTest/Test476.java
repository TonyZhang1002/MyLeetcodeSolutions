package ProblemTest;

import Problems.Problem476;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test476 {
    Problem476 problem476;

    @Before
    public void init () {
        problem476 = new Problem476();
    }

    @Test
    public void test1 () {
        assertEquals("Wrong", 2, problem476.findComplement(5));
    }

    @Test
    public void test2 () {
        assertEquals("Wrong", 0, problem476.findComplement(2147483647));
    }

}
