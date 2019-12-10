package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a-1]) { continue; }

            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b-1]) { continue; }

                int c = b + 1;  int d = nums.length - 1;
                while (c < d) {
                    int current = nums[a] + nums[b] + nums[c] + nums[d];
                    if (current > target) {
                        d--;
                    } else if (current < target) {
                        c++;
                    } else {
                        answer.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        while (c < d && nums[c] == nums[++c]);
                        while (c < d && nums[d] == nums[--d]);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {-5, -4, -3, -2, -1, 0, 0, 1, 2, 3, 4, 5}, 0));
    }
}
