package Problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Problem204 {
    public static int countPrimes(int n) {

        if (n == 0 || n == 1)   return 0;

        Set<Integer> notPrimeSet = new HashSet<>();
        for(int i = 2; i * i < n; i++) {
            for(int j = i; j * i < n; j++) {
                if (!notPrimeSet.contains(i * j)) {
                    notPrimeSet.add(i *j);
                }
            }
        }
        return n - 2 - notPrimeSet.size();
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(1500200));
    }
}
