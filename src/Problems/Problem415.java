package Problems;

public class Problem415 {
    public String addStrings(String num1, String num2) {
        int[] num1Ints = new int[num1.length()];
        int[] num2Ints = new int[num2.length()];
        int[] answer = new int[Math.max(num1.length(), num2.length()) + 1];

        for (int i = 0; i < num1.length(); i++){
            num1Ints[i] = num1.charAt(i) - '0';
        }

        for (int i = 0; i < num2.length(); i++){
            num2Ints[i] = num2.charAt(i) - '0';
        }

        int jw = 0; int num1Index = num1.length() - 1;  int num2Index = num2.length() - 1;  int answerIndex = answer.length - 1;
        while (num1Index > -1 || num2Index > -1 || answerIndex > -1) {
            int current = (num1Index > -1 ? num1Ints[num1Index] : 0) + (num2Index > -1 ? num2Ints[num2Index] : 0) + jw;
            answer[answerIndex] = current % 10;
            jw = current / 10;
            num1Index--;    num2Index--;    answerIndex--;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            builder.append((i == 0 && answer[i] == 0) ? "" : answer[i]);
        }
        return builder.toString();
    }
}
