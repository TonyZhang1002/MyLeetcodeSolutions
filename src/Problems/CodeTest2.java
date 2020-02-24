package Problems;

public class CodeTest2 {
    public static int solution (int input) {
        if(input ==0) {
            return 50;
        }
        int[] inputDigits = new int[4];
        boolean positive = (input >= 0);
        input = Math.abs(input);
        int index = 3;
        while(input != 0) {
            inputDigits[index] = input % 10;
            input /= 10;
            index--;
        }
        int answer = 0;
        boolean start = false;
        boolean added = false;
        if (positive) {
            for (int i = 0; i < 4; i++) {
                if (inputDigits[i] == 0 && !start) {
                    continue;
                } else if (inputDigits[i] != 0 && !start) {
                    start = true;
                }
                if (inputDigits[i] >= 5) {
                    answer += (added ? inputDigits[i] * Math.pow(10,3-i) : inputDigits[i] * Math.pow(10,4-i));
                } else if (inputDigits[i] < 5) {
                    if (!added) {answer += 5 * Math.pow(10,4-i) + inputDigits[i] * Math.pow(10,3-i);}
                    else {answer += inputDigits[i] * Math.pow(10,3-i);}
                    added = true;
                }
            }
            if (!added) {answer += 5;}
        } else {
            for (int i = 0; i < 4; i++) {
                if (inputDigits[i] == 0 && !start) {
                    continue;
                } else if (inputDigits[i] != 0 && !start) {
                    start = true;
                }
                if (inputDigits[i] > 5) {
                    if (!added) {answer += 5 * Math.pow(10,4-i) + inputDigits[i] * Math.pow(10,3-i);}
                    else {answer += inputDigits[i] * Math.pow(10,3-i);}
                    added = true;
                } else if (inputDigits[i] <= 5) {
                    answer += (added ? inputDigits[i] * Math.pow(10,3-i) : inputDigits[i] * Math.pow(10,4-i));
                }
            }
            if (!added) {answer += 5;}
            answer = 0-answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(756));
    }
}
