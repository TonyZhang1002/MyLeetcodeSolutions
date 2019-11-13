package Problems;

public class Problem28 {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.length() == 0) {
                return 0;
            }
            OK:
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break OK;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
