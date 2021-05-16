package Problems;

public class Problem1837 {
    public static int sumBase(int n, int k) {
        int answer = 0;
        while (n >= k) {
            int digit = n % k;
            n = (n - digit) / k;
            answer += digit;
        }
        return answer + n;
    }

    public static void main(String[] args) {
        System.out.println(sumBase(1,5));
    }
}
