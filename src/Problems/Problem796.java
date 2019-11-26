package Problems;

public class Problem796 {
    public boolean rotateString(String A, String B) {

        if(A.equals(B)) return true;

        String currentB = B;
        for (int i = 0; i < A.length() - 1; i++) {
            currentB = reverseShift(currentB);
            if (A.equals(currentB))    return true;
        }

        return false;
    }

    private String reverseShift(String a) {
        return a.substring(a.length()-1) + a.substring(0, a.length() - 1);
    }
}
