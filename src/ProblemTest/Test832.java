package ProblemTest;

import Problems.Problem832;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
@author Qinyuan Zhang
@date 02/09/2019
*/
public class Test832 {
   Problem832 problem832 = new Problem832();

   @Test
   public void test1() {
      assertEquals("Wrong", new int[][] {{1,0,0},{0,1,0},{1,1,1}}, problem832.flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}}));
   }

   @Test
   public void test2() {
      assertEquals("Wrong", new int[][] {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}, problem832.flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
   }
}
