package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem884 {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> answer = new LinkedList<>();

        String[] arrayAB = (A + " " + B).split(" ");

        Arrays.sort(arrayAB);

        for (int i = 0; i < arrayAB.length; i++) {
            System.out.print(arrayAB[i] + " ");
        }

        int slow = 0;
        int fast = 0;
        boolean simiFlag = false;

        if (arrayAB.length > 2){
            fast++;
        }

        while(fast < arrayAB.length) {
            if (arrayAB[slow].compareTo(arrayAB[fast]) != 0 ) {
                if (simiFlag) {
                    simiFlag = false;
                    slow = fast;
                } else {
                    answer.add(arrayAB[slow]);
                    slow++;
                }
            } else {
                simiFlag = true;
            }
            fast++;
        }

        if (!simiFlag) {
            answer.add(arrayAB[fast -1]);
        }

        String[] arrayAns = new String[answer.size()];
        for (int m = 0; m < answer.size(); m ++) {
            arrayAns[m] = answer.get(m);
        }

        return arrayAns;
    }
}
