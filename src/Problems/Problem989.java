package Problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem989 {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        String kStr = Integer.toString(K);
        int[] kInts = new int[kStr.length()];

        for (int i = 0; i < kStr.length(); i++){
            kInts[i] = kStr.charAt(i) - '0';
        }

        int[] answer = new int[Math.max(A.length, kInts.length) + 1];

        int jw = 0; int num1Index = A.length - 1;  int num2Index = kInts.length - 1;  int answerIndex = answer.length - 1;
        while (num1Index > -1 || num2Index > -1 || answerIndex > -1) {
            int current = (num1Index > -1 ? A[num1Index] : 0) + (num2Index > -1 ? kInts[num2Index] : 0) + jw;
            answer[answerIndex] = current % 10;
            jw = current / 10;
            num1Index--;    num2Index--;    answerIndex--;
        }

        List<Integer> intList = new ArrayList<>(answer.length);
        for(int i = 0; i < answer.length; i++) {
            if (i == 0 && answer[i] == 0) continue;
            intList.add(answer[i]);
        }
        return intList;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9},1));
    }
}
