package ProblemTest;

import Problems.Problem118;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test118 {
    Problem118 problem118;
    List<Integer> para = new LinkedList<>();

    @Before
    public void init() {
        problem118 = new Problem118();
        para.add(1);
        para.add(4);
        para.add(6);
        para.add(4);
        para.add(1);
    }

    @Test
    public void test1() {
        assertEquals("Wrong", 5, problem118.generate(5).size());
    }
}
