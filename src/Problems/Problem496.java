package Problems;

public class Problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int p = findNextGreater(nums1[i],nums2);
            if (p == nums1[i]) {
                answer[i] = -1;
            } else {
                answer[i] = p;
            }
        }

        return answer;
    }

    public int findNextGreater(int target, int[] arr) {
        int r = target;
        boolean flag = false;

        for(int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
               flag = true;
           }
           if (flag && arr[i] > r) {
               return arr[i];
           }
        }

        return r;
    }

}
