package Problems;

public class Problem861 {
    public int matrixScore(int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                flipHori(A, i);
            }
        }

        result += Math.pow(2,A[0].length - 1) * A.length;

        for (int i = 1; i < A[0].length; i++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 1) {
                    one++;
                } else {
                    zero++;
                }
            }
            result += Math.pow(2,A[0].length - i - 1) * Math.max(one, zero);
        }

        return result;
    }

    public void flipHori (int [][] A, int row) {
        for (int i = 0; i < A[row].length; i++) {
            if (A[row][i] == 0) { A[row][i] = 1; }
            else { A[row][i] = 0; }
        }
    }

}
