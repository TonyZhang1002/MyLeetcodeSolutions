package Problems;

import java.util.LinkedList;

public class Problem20 {
    public static boolean isValid(String s) {
        LinkedList<Integer> flags = new LinkedList<>();
        char[] sChars = s.toCharArray();

        for(int i = 0; i < sChars.length; i++) {
            if (sChars[i] == 40) {
                flags.add(0);
            } else if (sChars[i] == 91) {
                flags.add(1);
            } else if (sChars[i] == 123) {
                flags.add(2);
            } else if (sChars[i] == 41 || sChars[i] == 93 || sChars[i] == 125) {
                if (!modifyPreFlag(flags, i, sChars[i]))    return false;
            }
        }

        return flags.isEmpty() ? true : false;
    }

    private static boolean modifyPreFlag (LinkedList<Integer> flags, int index, char c) {
        int target = 0;
        if (c == 93)    target = 1;
        else if (c == 125)  target = 2;
        if (index == 0 || flags.isEmpty())  return false;
        if (flags.getLast() != target)  return false;
        else {
            flags.removeLast();
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}
