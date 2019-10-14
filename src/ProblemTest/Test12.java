package ProblemTest;

import Problems.Problem12;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test12 {
    Problem12 problem12 = new Problem12();

    @Test
    public void test1 () {
        assertEquals ("Wrong", "IX", problem12.intToRoman(9));
    }

    @Test
    public void test2 () {
        assertEquals ("Wrong", "LVIII", problem12.intToRoman(58));
    }

    @Test
    public void test3 () {
        assertEquals ("Wrong", "MCMXCIV", problem12.intToRoman(1994));
    }

    @Test
    public void test4 () {
        assertEquals ("Wrong", "MMMCMXCIV", problem12.intToRoman(3994));
    }

}
