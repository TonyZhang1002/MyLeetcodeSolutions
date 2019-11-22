package Problems;

public class Problem640 {
    public String solveEquation(String equation) {
        String answer;
        String[] equationDiff = equation.split("=");
        String equationLeft = equationDiff[0];
        String equationRight = equationDiff[1];

        int[] simpleLeft = calculateHalfEquation(equationLeft);
        int[] simpleRight = calculateHalfEquation(equationRight);

        int xInTotal = simpleLeft[0] - simpleRight[0];
        int numsInTotal = simpleRight[1] - simpleLeft[1];

        if (xInTotal == 0 && numsInTotal == 0) {
            answer = "Infinite solutions";
        } else if (xInTotal == 0 && numsInTotal != 0) {
            answer = "No solution";
        } else {
            answer = "x=" + numsInTotal/xInTotal;
        }

        return answer;
    }

    private int[] calculateHalfEquation (String e) {
        int valueForX = 0;
        int valueForNum = 0;
        int back = 0;
        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == '+' || e.charAt(i) == '-' || i == e.length() - 1) {
                String subString;
                if (i == e.length() - 1)    subString = e.substring(back);
                else subString = e.substring(back, i);
                if (subString.contains("x")) {
                    int numForX;
                    if (subString.replace("x","").equals("") || subString.replace("x","").equals("+")) {
                        numForX = 1;
                    } else if (subString.replace("x","").equals("-")) {
                        numForX = -1;
                    } else {
                        numForX = Integer.parseInt(subString.replace("x",""));
                    }
                    valueForX += numForX;
                } else if (!subString.equals("")) {
                    int num = Integer.parseInt(subString);
                    valueForNum += num;
                }
                back = i;
            }
        }
        return new int[] {valueForX, valueForNum};
    }

}
