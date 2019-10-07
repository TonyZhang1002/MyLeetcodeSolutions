package Problems;

public class Problem11 {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l += findTheNextBiggest(height, l);
            else
                r -= findThePreviousBiggest(height, r);
        }

        return maxarea;

    }

    public int findTheNextBiggest (int[] a, int l) {
        int count = 1;
        int currentMax = a[l];
        while (currentMax > a[++l]) {
            count++;
        }
        return count;
    }

    public int findThePreviousBiggest (int[] a, int r) {
        int count = 1;
        int currentMax = a[r];
        while (currentMax > a[--r]) {
            count++;
        }
        return count;
    }
}
