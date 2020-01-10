package Problems;

import java.util.Arrays;

public class Problem33 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (l == r) {
            return nums[0] == target ? 0 : -1;
        }

        int m;

        while (l < r) {
             m = (l + r) / 2;
            if (nums[l] == target)  return l;
            if (nums[r] == target)  return r;
            if (nums[m] < nums[r]) {
                if (nums[m] > target) {
                    r = m - 1;
                } else if (nums[m] < target && nums[l] > target) {
                    l = m + 1;
                } else if (nums[m] < target && nums[l] < target && nums[r] < target) {
                    r = m - 1;
                } else if (nums[m] < target && nums[l] < target && nums[r] > target) {
                    l = m + 1;
                } else {
                    return m;
                }
            } else {
                if (nums[m] > target && nums[l] > target) {
                    l = m + 1;
                } else if (nums[m] > target && nums[l] < target) {
                    r = m - 1;
                } else if (nums[m] < target) {
                    l = m + 1;
                } else {
                    return m;
                }
            }
        }
        return -1;
    }
}
