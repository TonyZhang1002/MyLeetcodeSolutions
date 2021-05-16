package Problems;

public class Problem1304 {
    public static int[] sumZero(int n) {
        int start = n/2;
        int[] answer = new int[n];
        int i = 0;
        while (i < n) {
            if (start == 0) {
                if (n % 2 == 0) {
                    start--;
                    continue;
                }
            }
            answer[i] = start;
            i++;
            start--;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(sumZero(4));
    }
}
