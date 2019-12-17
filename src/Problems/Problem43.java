package Problems;

import java.util.Arrays;

public class Problem43 {
    public static String multiply(String num1, String num2) {
        int[] num1Ints = new int[num1.length()];
        int[] num2Ints = new int[num2.length()];
        int[] answer = new int[num1.length() + num2.length()];

        for (int i = 0; i < num1.length(); i++){
            num1Ints[i] = num1.charAt(i) - '0';
        }

        for (int i = 0; i < num2.length(); i++){
            num2Ints[i] = num2.charAt(i) - '0';
        }

        if ((num1Ints.length == 1 && num1Ints[0] == 0) || (num2Ints.length == 1 && num2Ints[0] == 0)) {
            return "0";
        }

        int[] smaller;  int[] bigger;
        if (num1.length() > num2.length()) {
            smaller = num2Ints; bigger = num1Ints;
        } else {
            smaller = num1Ints; bigger = num2Ints;
        }

        int[][] store = new int[smaller.length][bigger.length+1];
        for (int i = smaller.length - 1; i > -1; i--) {
            int target = smaller[i];
            store[smaller.length - 1 - i] = singleMulti(target, bigger);
        }

        int jw = 0;
        for (int i = answer.length - 1; i > -1; i--) {
            int current = jw;    int startIndex = bigger.length - (answer.length - 1 - i);     int j = 0;
            while (j < store.length && startIndex < bigger.length + 1) {
                if (startIndex > -1) {
                    current += store[j][startIndex];
                }
                startIndex++;   j++;
            }
            answer[i] = current % 10;
            jw = current / 10;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            builder.append((i == 0 && answer[i] == 0) ? "" : answer[i]);
        }
        return builder.toString();
    }

    private static int[] singleMulti(int a, int[] b) {
        int[] r = new int[b.length+1];
        int jw = 0;
        for (int i = b.length - 1; i > -1; i--) {
            int current = a * b[i] + jw;
            r[i+1] = current % 10;
            jw = current / 10;
        }
        r[0] = jw;
        return r;
    }

    public static void main(String[] args) {
        System.out.println(multiply("89523", "68546"));
    }
}
