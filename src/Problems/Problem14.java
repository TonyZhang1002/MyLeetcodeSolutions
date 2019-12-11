package Problems;

public class Problem14 {
    public static String longestCommonPrefix(String[] strs) {
        String answer = "";

        if (strs.length == 0) {
            return answer;
        }

        int index = 0;
        while (index < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() - 1 < index)   return answer;
                else if (strs[i].charAt(index) != strs[0].charAt(index)) return answer;
            }
            answer += strs[0].charAt(index);
            index++;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {""}));
    }
}
