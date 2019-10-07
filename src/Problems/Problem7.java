package Problems;

public class Problem7 {
    public int reverse(int x) {
        boolean positive = true;
        if (x < 0) {
            positive = false;
            x = -x;
        }
        int[] xNums = new int[10];
        int index = 0;
        while (x > 0) {
            xNums[index++] = x % 10;
            x = x / 10;
        }
        long answer = 0;

        boolean start = false;

        for (int i = 0; i < index; i++) {
            if (!start && xNums[i] != 0) {
                start = true;
                answer = 10 * answer + xNums[i];
            } else if (start && i < 9) {
                answer = 10 * answer + xNums[i];
            } else if (i == 9) {
                if (10 * answer + xNums[i] >= Integer.MAX_VALUE) {
                    return 0;
                } else {
                    answer = 10 * answer + xNums[i];
                }
            }
        }

        return positive ? (int)answer : (int)-answer;
    }

//    public static void main(String[] args) {
//        System.out.println(reverse(-243)[0]);
//    }
}
