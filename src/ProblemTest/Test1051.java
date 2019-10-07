package ProblemTest;

import Problems.Problem1051;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
@author Qinyuan Zhang
@date 04/09/2019
*/
public class Test1051 {
   Problem1051 problem1051 = new Problem1051();

   @Test
   public void test1() {
      assertEquals("Wrong", 3, problem1051.heightChecker(new int[] {1,1,4,2,1,3}));
   }

   @Test
   public void test2() {
      assertEquals("Wrong", 4, problem1051.heightChecker(new int[] {2,1,2,2,1,1}));
   }
}
