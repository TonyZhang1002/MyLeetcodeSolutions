package ProblemTest;

import Problems.Problem860;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
@author Qinyuan Zhang
@date 09/09/2019
*/
public class Test860 {
   Problem860 problem860 = new Problem860();

   @Test
   public void test1 () {
      assertEquals("Wrong", true, problem860.lemonadeChange(new int[] {5,5,10}));
   }

   @Test
   public void test2 () {
      assertEquals("Wrong", false, problem860.lemonadeChange(new int[] {10,10}));
   }

   @Test
   public void test3 () {
      assertEquals("Wrong", false, problem860.lemonadeChange(new int[] {5,5,10,10,20}));
   }
}
