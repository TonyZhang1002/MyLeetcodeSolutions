package Problems;

public class Problem824 {
    public String toGoatLatin(String S) {
        String[] original = S.split(" ");
        String answer = "";
        for(int i = 0; i < original.length; i++) {

            if(original[i].charAt(0) == 'a' || original[i].charAt(0) == 'e' || original[i].charAt(0) == 'i' ||
                    original[i].charAt(0) == 'o' || original[i].charAt(0) == 'u' || original[i].charAt(0) == 'A' ||
                    original[i].charAt(0) == 'E' || original[i].charAt(0) == 'I' ||
                    original[i].charAt(0) == 'O' || original[i].charAt(0) == 'U') {
                answer += original[i] + "ma";
            } else {
                answer += original[i].substring(1) + original[i].charAt(0) + "ma";
            }

            for (int j = 1; j < i + 2; j ++) {
                answer += "a";
            }

            if (i != original.length-1) {
                answer += " ";
            }
        }
        return answer;
    }

}
