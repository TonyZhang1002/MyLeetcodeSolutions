package Problems;

public class Problem397 {
    public int integerReplacement(int n) {
        int count = 0;
        if(n==Integer.MAX_VALUE){
            count = 2;
            n = 1073741824;
        }
        while (n > 1) {
            if(n == 3)
                return count+2;
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 4 == 1) {
                n--;
            } else {
                n++;
            }
            count++;
        }
        return count;
    }
}
