package Problems;

import java.util.LinkedList;
import java.util.List;

public class Problem204 {
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        for (int i = 0; i< n; i++)
            primes[i] = true;
        for(int i = 2; i * i < n; i++)
        {
            for(int j = i; j * i < n; j++)
                primes[j * i]= false;
        }
        for(int i= 2; i< n; i++)
            if(primes[i])
                count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
