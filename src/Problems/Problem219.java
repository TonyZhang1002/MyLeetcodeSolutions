package Problems;

import java.util.HashMap;
import java.util.Map;

public class Problem219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (index < nums.length) {
            if (!map.containsKey(nums[index])) {
                map.put(nums[index],index);
            } else if (map.containsKey(nums[index]) && index - map.get(nums[index]) <= k) {
                return true;
            } else {
                map.replace(nums[index], index);
            }
            index++;
        }

        return false;
    }
}
