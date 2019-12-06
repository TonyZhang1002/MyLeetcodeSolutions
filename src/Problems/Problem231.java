package Problems;

public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)  return false;
        while(n > 0) {
            if (n % 2 == 1 && n != 1) return false;
            else if (n == 1) return true;
            else n /= 2;
        }
        return false;
    }
}
