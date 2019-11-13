package Problems;

public class Problem917 {
    public String reverseOnlyLetters(String S) {
        int head = 0;
        int back = S.length() - 1;
        StringBuilder answer = new StringBuilder();

        while (head < S.length() && back > -1) {
            char C = S.charAt(head);
            char B = S.charAt(back);
            if (!ifChar(C)) {
                answer.append(C);
                head++;
            } else if (ifChar(C) && ifChar(B)) {
                answer.append(B);
                head++;
                back--;
            } else {
                back--;
            }
        }

        while (head < S.length()) {
            answer.append(S.charAt(head));
            head++;
        }

        return String.valueOf(answer);
    }

    public boolean ifChar (char B) {
        return ((int) B > 64 && (int) B < 91) || ((int) B > 96 && (int) B < 123);
    }
}
