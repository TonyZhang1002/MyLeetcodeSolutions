package Problems;

/*
@author Qinyuan Zhang
@date 02/09/2019
*/
public class Problem832 {
   public int[][] flipAndInvertImage(int[][] A) {
      for (int i = 0; i < A.length; i++) {
         reverse(A[i]);
         inverse(A[i]);
      }
      return A;
   }

   public void reverse (int[] input) {
      int temp;
      for (int i = 0; i < input.length / 2; i++) {
         temp = input[i];
         input[i] = input[input.length - i - 1];
         input[input.length - i - 1] = temp;
      }
   }

   public void inverse (int[] input) {
      for (int i = 0; i < input.length; i++) {
         input[i] = (input[i] == 0 ? 1 : 0);
      }
   }
}
