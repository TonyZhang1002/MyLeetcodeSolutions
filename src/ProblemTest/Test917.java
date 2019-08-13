package ProblemTest;

import Problems.Problem917;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test917 {
    Problem917 problem917 = new Problem917();

    @Test
    public void test1() {
        assertEquals("Wrong", "j-Ih-gfE-dCba", problem917.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    public void test2() {
        assertEquals("Wrong", "Qedo1ct-eeLg=ntse-T!", problem917.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
