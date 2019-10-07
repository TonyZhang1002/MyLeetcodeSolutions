package Problems;

import java.util.LinkedList;
import java.util.List;

public class Problem821 {
    public int[] shortestToChar(String S, char C) {
        int[] answer = new int[S.length()];
        List<Integer> cIndexs = new LinkedList<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                cIndexs.add(i);
            }
        }

        int leftIndex = 0;
        int rightIndex = 0;
        boolean leftFlag = true;

        for(int i = 0; i < S.length(); i++) {
            if (cIndexs.get(leftIndex) - i == 0 && leftFlag) {
                answer[i] = 0;
                if (cIndexs.size() > 1) {
                    rightIndex ++;
                }
                leftFlag = false;
            } else if (cIndexs.get(rightIndex) - i == 0 && !leftFlag) {
                answer[i] = 0;
                leftIndex++;
                rightIndex = rightIndex == cIndexs.size() - 1 ? cIndexs.size() - 1 : rightIndex+1;
            } else  {
                answer[i] = Math.min(Math.abs(cIndexs.get(leftIndex) - i), Math.abs(cIndexs.get(rightIndex) - i));
            }
        }

        return answer;
    }
}
