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

    public boolean isPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
}
