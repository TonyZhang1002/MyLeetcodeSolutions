package Problems;

public class Problem674 {
    public int findLengthOfLCIS(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;

        if (nums.length == 0) {
            return 0;
        }

        while (left < nums.length && right < nums.length - 1) {
            if (nums[right+1] > nums[right]) {
                max = Math.max(max, right - left + 1);
            } else {
                left = right+1;
            }
            right++;
        }

        return max+1;
    }
}
