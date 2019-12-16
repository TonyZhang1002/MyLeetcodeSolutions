package Problems;

import java.util.Arrays;

public class Problem67 {
    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        char[] answer = new char[Math.max(aChars.length, bChars.length) + 1];
        Arrays.fill(answer, '0');
        int jw = 0;
        int aIndex = aChars.length - 1;
        int bIndex = bChars.length - 1;
        int answerIndex = answer.length - 1;

        while (aIndex > -1 || bIndex > -1 || jw > 0) {
            int current = (aIndex > -1 ? aChars[aIndex] - 48 : 0) + (bIndex > -1 ? bChars[bIndex] - 48 : 0) + jw;
            if (current == 0)  answer[answerIndex--] = '0';
            else if (current == 1) {answer[answerIndex--] = '1'; jw = 0;}
            else if (current == 2) {answer[answerIndex--] = '0'; jw = 1;}
            else if (current == 3) {answer[answerIndex--] = '1'; jw = 1;}
            aIndex--;   bIndex--;
        }

        return new String(answer[0] == '0' ? Arrays.copyOfRange(answer, 1, answer.length) : answer);
    }
}
