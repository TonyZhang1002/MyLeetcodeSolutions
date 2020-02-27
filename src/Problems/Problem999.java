package Problems;

public class Problem999 {
    public int numRookCaptures(char[][] board) {
        int answer = 0;
        int rockRow = 0;
        int rockColumn = 0;
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rockRow = i;
                    rockColumn = j;
                }
            }
        }
        for (int i = rockColumn - 1; i > -1; i--) {
            if(board[rockRow][i] == '.') continue;
            if(board[rockRow][i] == 'B') break;
            if(board[rockRow][i] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = rockColumn + 1; i < 8; i++) {
            if(board[rockRow][i] == '.') continue;
            if(board[rockRow][i] == 'B') break;
            if(board[rockRow][i] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = rockRow - 1; i > -1; i--) {
            if(board[i][rockColumn] == '.') continue;
            if(board[i][rockColumn] == 'B') break;
            if(board[i][rockColumn] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = rockRow + 1; i < 8; i++) {
            if(board[i][rockColumn] == '.') continue;
            if(board[i][rockColumn] == 'B') break;
            if(board[i][rockColumn] == 'p') {
                answer++;
                break;
            }
        }
        return answer;
    }

}
