package Problems;

public class Problem81 {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (l == r) {
            return nums[0] == target;
        }

        int m;

        while (l < r) {
            m = (l + r) / 2;
            if (nums[l] == target)  return true;
            if (nums[r] == target)  return true;
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
                    return true;
                }
            } else if (nums[m] > nums[r]) {
                if (nums[m] > target && nums[l] > target) {
                    l = m + 1;
                } else if (nums[m] > target && nums[l] < target) {
                    r = m - 1;
                } else if (nums[m] < target) {
                    l = m + 1;
                } else {
                    return true;
                }
            } else {
                l++;
                r--;
            }
        }
        return false;
    }
}
