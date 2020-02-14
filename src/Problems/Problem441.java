package Problems;

public class Problem441 {
    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt((long)8*n+1) - 1) / 2);
    }
}
