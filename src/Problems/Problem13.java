package Problems;

public class Problem13 {
    public int romanToInt(String s) {
        char[] romans = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int answer = 0;

        char[] sChars = s.toCharArray();
        int index = 0;
        while (index < sChars.length) {
            if (sChars[index] == romans[6])     answer += 1000;
            else if (sChars[index] == romans[5])    answer += 500;
            else if (sChars[index] == romans[3])    answer += 50;
            else if (sChars[index] == romans[1])    answer += 5;
            else if (sChars[index] == romans[4]) {
                if (index < sChars.length - 1 && sChars[index + 1] == romans[5]) { answer += 400; index++; }
                else if (index < sChars.length - 1 && sChars[index + 1] == romans[6])    { answer += 900; index++; }
                else {answer+=100;}
            }
            else if (sChars[index] == romans[2]) {
                if (index < sChars.length - 1 && sChars[index + 1] == romans[3]) { answer += 40; index++; }
                else if (index < sChars.length - 1 && sChars[index + 1] == romans[4])    { answer += 90; index++; }
                else {answer+=10;}
            }
            else if (sChars[index] == romans[0]) {
                if (index < sChars.length - 1 && sChars[index + 1] == romans[1]) { answer += 4; index++; }
                else if (index < sChars.length - 1 && sChars[index + 1] == romans[2])    { answer += 9; index++; }
                else {answer+=1;}
            }
            index++;
        }

        return answer;
    }
}
