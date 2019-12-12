package Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    public static List<String> letterCombinations(String digits) {
        String[] numsToDigits = new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> answer = new ArrayList<>();
        char[] digitsChar = digits.toCharArray();
        if (digitsChar.length == 0) return answer;
        char[] first = numsToDigits[digitsChar[0] - 50].toCharArray();
        for (int i = 0; i < first.length; i++) {
            answer.add(String.valueOf(first[i]));
        }

        for (int i = 1; i < digitsChar.length; i++) {
            int index = digitsChar[i] - 50;
            char[] currentChars = numsToDigits[index].toCharArray();
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < currentChars.length; j++) {
                for (String s : answer) {
                    temp.add(s + currentChars[j]);
                }
            }
            answer = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("9"));
    }
}
