package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] answerArray = new int[Math.min(nums1.length, nums2.length)];

        int index1 = 0;
        int index2 = 0;
        int indexAnswer = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) index2++;
            else if (nums1[index1] < nums2[index2]) index1++;
            else {
                answerArray[indexAnswer] = nums1[index1];
                index1++;
                index2++;
                indexAnswer++;
            }
        }

        return Arrays.copyOfRange(answerArray, 0, indexAnswer);
    }
}
