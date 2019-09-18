package Problems;

public class Problem807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int answer = 0;
        int[] topDownSkyline = new int[grid[0].length];
        int[] rightLeftSkyline = new int[grid.length];

        for (int i = 0; i < grid[0].length; i++) {
            int max = grid[0][i];
            for (int j = 1; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            topDownSkyline[i] = max;
        }

        for (int i = 0; i < grid.length; i++) {
            int max = grid[i][0];
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            rightLeftSkyline[i] = max;
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int target = Math.min(topDownSkyline[i], rightLeftSkyline[j]);
                answer += (target - grid[j][i]);
            }
        }

        return answer;
    }
}
