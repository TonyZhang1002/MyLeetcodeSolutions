package ProblemTest;

import static org.junit.Assert.*;

import Problems.Problem824;
import org.junit.Before;
import org.junit.Test;

public class Test824 {
    Problem824 problem824;

    @Before
    public void init() {
        problem824 = new Problem824();
    }

    @Test
    public void test1() {
        assertEquals("Wrong", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa", problem824.toGoatLatin("I speak Goat Latin"));
    }

    @Test
    public void test2() {
        assertEquals("Wrong", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                problem824.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }


}
