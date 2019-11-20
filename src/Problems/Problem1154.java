package Problems;

import java.util.Arrays;
import java.util.List;

public class Problem1154 {
    public int dayOfYear(String date) {
        int answer = 0;

        String[] spitted = date.split("-");
        int year = Integer.parseInt(spitted[0]);
        int month = Integer.parseInt(spitted[1]);
        int day = Integer.parseInt(spitted[2]);

        int[] day_31_Month = new int[] {1,3,5,7,8,10,12,14};
        int[] day_30_Month = new int[] {4,6,9,11,13};

        for (int i = 1; i < month; i++) {
            if (inTheMonthsArray(day_31_Month,i)) {
                answer += 31;
            } else if (inTheMonthsArray(day_30_Month,i)) {
                answer += 30;
            } else {
                answer += ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
            }
        }

        answer += day;
        return answer;
    }

    private boolean inTheMonthsArray (int[] months, int m) {
        int left = 0;
        int right = months.length -1;
        while (left < right) {
            if (months[(left + right) /2] > m) {
                right = (left + right) /2;
            } else if (months[(left + right) /2] < m) {
                left = (left + right + 1) /2;
            } else {
                return true;
            }
        }
        return false;
    }
}
