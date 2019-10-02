package Problems;

public class Problem537 {
    public String complexNumberMultiply(String a, String b) {

        String[] aArray = a.split("\\+");
        String[] bArray = b.split("\\+");

        String a0 = aArray[0];
        String b0 = bArray[0];
        String a1 = aArray[1].replace("i","");
        String b1 = bArray[1].replace("i","");

        int i0 = Integer.valueOf(a0) * Integer.valueOf(b0);
        int i1 = Integer.valueOf(a0) * Integer.valueOf(b1) + Integer.valueOf(a1) * Integer.valueOf(b0);
        int i2 = Integer.valueOf(a1) * Integer.valueOf(b1);

        String answer = (i0 - i2) + "+" + i1 + "i";

        return answer;
    }
}
