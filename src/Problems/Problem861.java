package Problems;

public class Problem861 {
    public int matrixScore(int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                flipHori(A, i);
            }
        }

        for (int i = 0; i < A[0].length; i++) {
            int balance = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 1) {
                    balance++;
                } else {
                    balance--;
                }
            }
            if (balance < 0 ) {
                flipVerti(A, i);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    result += Math.pow(2,A[0].length - j - 1);
                }
            }
        }
        return result;
    }

    public void flipHori (int [][] A, int row) {
        for (int i = 0; i < A[row].length; i++) {
            if (A[row][i] == 0) { A[row][i] = 1; }
            else { A[row][i] = 0; }
        }
    }

    public void flipVerti (int [][] A, int line) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][line] == 0) { A[i][line] = 1; }
            else { A[i][line] = 0; }
        }
    }
}
