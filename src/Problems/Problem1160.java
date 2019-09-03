package Problems;

import java.util.Arrays;

/*
@author Qinyuan Zhang
@date 03/09/2019
*/
public class Problem1160 {
   public int countCharacters(String[] words, String chars) {
      int[] srcCharMap = new int[26];
      for (char c : chars.toCharArray()) {
         srcCharMap[c - 'a']++;
      }
      int res = 0;
      boolean good = false;
      int[] tmp = Arrays.copyOf(srcCharMap, srcCharMap.length);
      for (String word : words) {
         good = true;
         for (char c : word.toCharArray()) {
            if (--tmp[c-'a'] < 0) {
               good = false;
               break;
            }
         }
         if (good) {
            res += word.length();
         }
         System.arraycopy(srcCharMap, 0, tmp, 0, srcCharMap.length);
      }
      return res;
   }
}
