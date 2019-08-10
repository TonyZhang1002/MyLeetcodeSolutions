package Problems;

public class Problem762 {
    public int countPrimeSetBits(int L, int R) {
        int answer = 0;
        for(int i = L; i <= R; i++) {
            if(isPrime(primeSets(i))) {
                answer++;
            }
        }
        return answer;
    }

    public int primeSets(int p) {
        int answer = 0;
        while (p != 0) {
            if((p & 1) == 1) {
                answer++;
            }
            p = p >> 1;
        }
        return answer;
    }

    public boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= sqrt; i+=2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }
}
