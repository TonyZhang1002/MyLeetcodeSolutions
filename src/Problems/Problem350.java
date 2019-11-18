package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> answer = new LinkedList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) index2++;
            else if (nums1[index1] < nums2[index2]) index1++;
            else {
                answer.add(nums1[index1]);
                index1++;
                index2++;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
