package Problems;

public class Problem69 {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;

        if (x == 1 || x == 0) {
            return x;
        }

        while (left != right && left + 1 != right) {
            int current = (left + right) / 2;
            if (current > 46341) {
                right = 46341;
                continue;
            }
            int n = current * current;
            if (n > x) { right = current; }
            else if (n < x) { left = current; }
            else return current;
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
