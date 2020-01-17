package Problems;

import java.util.Arrays;

public class Problem1189 {
    public static int maxNumberOfBalloons(String text) {
        int[] numsOfLetters = new int[5];
        Arrays.fill(numsOfLetters, 0);
        char[] textArrays = text.toCharArray();
        for (char c : textArrays) {
            if (c == 'b') {numsOfLetters[0]++;}
            if (c == 'a') {numsOfLetters[1]++;}
            if (c == 'l') {numsOfLetters[2]++;}
            if (c == 'o') {numsOfLetters[3]++;}
            if (c == 'n') {numsOfLetters[4]++;}
        }
        int min = numsOfLetters[0];
        for (int i = 1; i < 5; i++) {
            if (i == 1 || i == 4) min = Math.min(min, numsOfLetters[i]);
            else min = Math.min(min, numsOfLetters[i] / 2);
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
