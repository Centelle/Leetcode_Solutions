package Leetcode.Medium;

public class SurroundedRegions {
    /**
     * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
     *
     * A region is captured by flipping all 'O's into 'X's in that surrounded region.
     *
     * Example:
     *
     * X X X X
     * X O O X
     * X X O X
     * X O X X
     * After running your function, the board should be:
     *
     * X X X X
     * X X X X
     * X X X X
     * X O X X
     * Explanation:
     *
     * Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not
     * flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be
     * flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
     */
    public void solve(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        for (int j = 0; j < columns; j++) {
            if (grid[0][j] == 'O') {
                callDFS(grid, 0, j);
            }
            if (grid[rows - 1][j] == 'O') {
                callDFS(grid, rows - 1, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 'O') {
                callDFS(grid, i, 0);
            }
            if (grid[i][columns - 1] == 'O') {
                callDFS(grid, i, columns - 1);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 'O') {
                    grid[i][j] = 'X';
                }
                if (grid[i][j] == '*') {
                    grid[i][j] = 'O';
                }
            }
        }
    }

    public void callDFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
                grid[i][j] == 'X' || grid[i][j] == '*') {
            return;
        }
        if (grid[i][j] == 'O') {
            grid[i][j] = '*';
        }
        callDFS(grid, i + 1, j);
        callDFS(grid, i - 1, j);
        callDFS(grid, i, j + 1);
        callDFS(grid, i, j - 1);
    }

    public static void main(String[] args) {
        SurroundedRegions ob = new SurroundedRegions();
        char[][] grid = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        System.out.println("grid.length = " + grid.length);
        System.out.println("grid[0].length = " + grid[0].length);
        ob.solve(grid);
    }
}
