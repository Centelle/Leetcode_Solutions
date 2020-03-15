package Leetcode.Medium;

public class WallsAndGates {
    public final int INF = Integer.MAX_VALUE;

    /**
     * @param grid given a 2D array where
     *             0 represents a gate
     *             -1 represents a barrier / wall
     *             INF or Integer.MAX_VALUE represents the value assigned to a cell
     *             <p>
     *             TODO:
     *             replace INF with the shortest distance to the nearest gate
     *             <p>
     *             Sample Input
     *             <p>
     *             INF  -1  0  INF
     *             INF INF INF  -1
     *             INF  -1 INF  -1
     *             0    -1 INF INF
     *             <p>
     *             Output
     *             3  -1   0   1
     *             2   2   1  -1
     *             1  -1   2  -1
     *             0  -1   3   4
     */
    public void solve(int[][] grid) {
        int width = grid[0].length;
        int len = grid.length;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 0) {
                    assignDistance(grid, visited, i, j, 0);
                }
            }
        }
    }

    public void assignDistance(int[][] grid, boolean[][] visited, int row, int col, int distance) {
        if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
            return;
        }

        if (visited[row][col]) {
            return;
        }
        if (grid[row][col] == -1) {
            return;
        }
        visited[row][col] = true;

        grid[row][col] = Math.min(grid[row][col], distance);

        assignDistance(grid, visited, row + 1, col, distance + 1);
        assignDistance(grid, visited, row - 1, col, distance + 1);
        assignDistance(grid, visited, row, col + 1, distance + 1);
        assignDistance(grid, visited, row, col - 1, distance + 1);
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        final int INF = Integer.MAX_VALUE;
        WallsAndGates path = new WallsAndGates();
        int[][] grid = {
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF},
                {0, -1, INF, INF},
        };
        path.solve(grid);
        printArray(grid);

    }

    public static void printArray(int[][] arr) {
        System.out.println("============================");
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }
}
