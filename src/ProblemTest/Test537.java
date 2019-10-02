package ProblemTest;

import Problems.Problem537;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test537 {
    Problem537 problem537 = new Problem537();

    @Test
    public void Test1 () {
        assertEquals("Wrong", "0+2i", problem537.complexNumberMultiply("1+1i","1+1i"));
    }

    @Test
    public void Test2 () {
        assertEquals("Wrong", "0+-2i", problem537.complexNumberMultiply("1+-1i","1+-1i"));
    }
}
