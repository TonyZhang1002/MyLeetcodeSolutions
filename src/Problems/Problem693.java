package Problems;

public class Problem693 {
    public boolean hasAlternatingBits(int n) {
        if (n > 1);
        return (n & (n + 1)) == 0;
    }
}
