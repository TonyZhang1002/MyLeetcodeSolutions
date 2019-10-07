package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new LinkedList<>();
        List<Integer> previousLine = new LinkedList<>();
        int index = 1;

        if(numRows == 0) {
            return answer;
        } else if (numRows == 1) {
            previousLine.add(1);
            answer.add(previousLine);
            return answer;
        } else {
            previousLine.add(1);
            answer.add(previousLine);

            while (index < numRows) {
                List<Integer> thisLine = new LinkedList<>();
                thisLine.add(1);
                for (int i = 0; i < previousLine.size() - 1; i++ ) {
                    thisLine.add(previousLine.get(i) + previousLine.get(i+1));
                }
                thisLine.add(1);
                answer.add(thisLine);
                previousLine = thisLine;
                index++;
            }

            return answer;
        }
    }
}
