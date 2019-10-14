package Problems;


import java.util.stream.IntStream;

public class Problem12 {
    public String intToRoman(int num) {

        int[] xNums = new int[4];
        int index = 0;
        while (num > 0) {
            xNums[index++] = num % 10;
            num = num / 10;
        }

        StringBuffer answer = new StringBuffer();

        for (int i = 3; i > -1; i--) {
            answer.append(partialToRoman(xNums[i],i));
        }

        return answer.toString();
    }

    public String partialToRoman (int value, int index) {
        String[] handlingCodes = new String[] {"I","V","X","L","C","D","M"};
        StringBuffer returnValue = new StringBuffer();

        if (value == 0) return "";
        else if (value > 0 && value < 4) {
            for (int i = 0; i < value; i++) {
                returnValue.append(handlingCodes[index * 2]);
            }
        } else if (value == 4) {
            returnValue.append(handlingCodes[index * 2] + handlingCodes[index * 2 + 1]);
        } else if (value == 5) {
            returnValue.append(handlingCodes[index * 2 + 1]);
        } else if (value > 5 && value < 9) {
            returnValue.append(handlingCodes[index * 2 + 1]);
            for (int i = 5; i < value; i++) {
                returnValue.append(handlingCodes[index * 2]);
            }
        } else if (value == 9) {
            returnValue.append(handlingCodes[index * 2] + handlingCodes[index * 2 + 2]);
        }
        return returnValue.toString();
    }
}
