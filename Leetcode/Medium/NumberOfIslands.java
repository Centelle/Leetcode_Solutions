package Leetcode.Medium;

public class NumberOfIslands {
    /**
     * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
     * You may assume all four edges of the grid are all surrounded by water.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * 11110
     * 11010
     * 11000
     * 00000
     * <p>
     * Output: 1
     * Example 2:
     * <p>
     * Input:
     * 11000
     * 11000
     * 00100
     * 00011
     * <p>
     * Output: 3
     */
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    System.out.println("grid [ " + i + " ] [ " + j + " ] is one '1'");
                    count++;
                    findIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    public void findIsland(char[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0) {
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        } else{
            return;
        }
        findIsland(grid, i + 1, j);
        findIsland(grid, i - 1, j);
        findIsland(grid, i , j + 1);
        findIsland(grid, i , j - 1);
    }

    public static void printArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        NumberOfIslands i1 = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '1'},
                {'1', '1', '0', '1'},
                {'1', '1', '0', '1'},
                {'1', '1', '0', '1'},

        };
        System.out.println("i1.num_Islands(grid) = " + i1.numIslands(grid));
    }
}
