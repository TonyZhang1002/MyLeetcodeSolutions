package Problems;

import java.util.Stack;

/*
@author Qinyuan Zhang
@date 09/09/2019
*/
public class Problem860 {
   public boolean lemonadeChange(int[] bills) {
      int[] cashIn = new int[] {0, 0, 0};

      for (int i : bills) {
         int change = i - 5;

         for (int j = 2; j > -1; j--) {
            int billsValue = 5;
            if (j == 2) {
               billsValue = 20;
            } else if (j == 1) {
               billsValue = 10;
            }
            while (change > 0 && cashIn[j] > 0 && billsValue <= change) {
               change -= billsValue;
               cashIn[j] -= 1;
            }
         }

         if (change != 0) {
            return false;
         }

         if (i == 5) {
            cashIn[0]++;
         }
         else if (i == 10) {
            cashIn[1]++;
         } else {
            cashIn[2]++;
         }
      }
      return true;
   }
}
