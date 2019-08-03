package Problems;

public class Problem985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            A[queries[i][1]] += queries[i][0];
            answer[i] = evenSumUP(A);
        }

        return answer;
    }

    public int evenSumUP (int[] A) {
        int answer = 0;
        for (int i: A) {
            if ((i & 1) == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
