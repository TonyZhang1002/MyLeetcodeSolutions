package Problems;

import java.util.Arrays;

/*
@author Qinyuan Zhang
@date 04/09/2019
*/
public class Problem1051 {
   public int heightChecker(int[] heights) {
      int[] heightsClone = heights.clone();
      Arrays.sort(heightsClone);
      int counter = 0;
      for(int i = 0;i<heights.length;i++){
         if(heights[i] != heightsClone[i]) {
            counter++;
         }
      }
      return counter;
   }
}
