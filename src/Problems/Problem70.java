package Problems;

public class Problem70 {
    public static int climbStairs(int n) {
        int x = 1; int y = 0;
        while (n != -1) {
            n--;
            int oldX = x;
            x = y;
            y = oldX + y;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
