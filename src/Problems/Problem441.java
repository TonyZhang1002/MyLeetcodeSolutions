package Problems;

public class Problem441 {
    public int arrangeCoins(int n) {
        if (n == 0) return 0;

        int index = 1;

        while (n >= index) {
            n -= index;
            index++;
        }

        return index - 1;
    }
}
