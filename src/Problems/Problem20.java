package Problems;

import java.util.Arrays;

public class Problem20 {
    public static boolean isValid(String s) {
        int[] flags = new int[s.length()];
        Arrays.fill(flags, -1);
        char[] sChars = s.toCharArray();

        for(int i = 0; i < sChars.length; i++) {
            if (sChars[i] == 40) {
                flags[i] = 0;
            } else if (sChars[i] == 91) {
                flags[i] = 1;
            } else if (sChars[i] == 123) {
                flags[i] = 2;
            } else if (sChars[i] == 41 || sChars[i] == 93 || sChars[i] == 125) {
                if (!modifyPreFlag(flags, i, sChars[i]))    return false;
            }
        }

        for (int i : flags) {
            if(i != -1) return false;
        }
        return true;
    }

    private static boolean modifyPreFlag (int[] flags, int index, char c) {
        int target = 0;
        if (c == 93)    target = 1;
        else if (c == 125)  target = 2;
        if(index == 0)  return false;
        for (int i = index - 1; i > -1; i--) {
            if (flags[i] != -1 && flags[i] != target) {
                return false;
            } else if (flags[i] == target) {
                flags[i] = -1;
                break;
            } else if (i == 0)  return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
