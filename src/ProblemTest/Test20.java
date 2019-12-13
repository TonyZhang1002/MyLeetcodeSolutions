package ProblemTest;

import org.junit.Assert;
import org.junit.Test;

import Problems.Problem20;

public class Test20 {
    Problem20 problem20 = new Problem20();

    @Test
    public void test1 () {
        Assert.assertEquals("Wrong", true, problem20.isValid("()"));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("Wrong", false, problem20.isValid("["));
    }

    @Test
    public void test3 () {
        Assert.assertEquals("Wrong", false, problem20.isValid("]"));
    }

    @Test
    public void test4 () {
        Assert.assertEquals("Wrong", true, problem20.isValid("[()]{}"));
    }

    @Test
    public void test5 () {
        Assert.assertEquals("Wrong", false, problem20.isValid("[()]{"));
    }

    @Test
    public void test6 () {
        Assert.assertEquals("Wrong", false, problem20.isValid("[()]]"));
    }

    @Test
    public void test7 () {
        Assert.assertEquals("Wrong", true, problem20.isValid("(){[](){}}"));
    }

    @Test
    public void test8 () {
        Assert.assertEquals("Wrong", false, problem20.isValid("(){[]({)}{}}"));
    }
}
