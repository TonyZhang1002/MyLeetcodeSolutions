package Problems;

import java.util.LinkedList;
import java.util.List;

public class Problem19 {
    public boolean isHappy(int n) {
        int min = n;
        int next = min;
        while (min != 1) {
            next = calculateSum(next);
            if (min == next) {
                return false;
            } else if (min == 2 || min == 3 || min == 4 || min == 5 || min == 6) {
                return false;
            } else {
                min = Math.min(min, next);
            }
        }
        return true;
    }

    private List<Integer> eachDigits (int n) {
        List<Integer> answer = new LinkedList<>();
        while (n > 0) {
            answer.add(n % 10);
            n = n / 10;
        }
        return answer;
    }

    private int calculateSum (int n) {
        int answer = 0;
        List<Integer> eachDig = eachDigits(n);
        for (int a : eachDig) {
            answer += Math.pow(a, 2);
        }
        return answer;
    }
}
