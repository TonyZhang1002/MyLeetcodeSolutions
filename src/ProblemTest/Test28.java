package ProblemTest;

import Problems.Problem28;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test28 {
    Problem28 problem28 = new Problem28();

    @Test
    public void test1() {
            assertEquals ("Wrong", 2, problem28.strStr("hello","ll"));
    }

    @Test
    public void test2() {
        assertEquals ("Wrong", -1, problem28.strStr("aaaaa","bba"));
    }

    @Test
    public void test3() {
        assertEquals ("Wrong", 0, problem28.strStr("",""));
    }
}
