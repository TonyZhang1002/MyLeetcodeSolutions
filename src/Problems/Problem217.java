package Problems;

import java.util.Arrays;

public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;

        while (left < nums.length - 1) {
            if (nums[left] == nums[++left]) {
                return true;
            }
        }
        return false;
    }
}
