package ProblemTest;

import Problems.Problem884;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Test884 {
    Problem884 problem884 = new Problem884();

    @Test
    public void test1() {
        assertArrayEquals("Wrong", new String[] {"banana"},
                problem884.uncommonFromSentences("apple apple", "banana"));
    }

    @Test
    public void test2() {
        assertArrayEquals("Wrong", new String[] {"sour","sweet"},
                problem884.uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }
}
