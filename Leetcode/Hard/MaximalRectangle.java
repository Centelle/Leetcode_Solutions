package Leetcode.Hard;

/*
Given a 2D binary matrix filled with 0's and 1's,
find the largest rectangle containing only 1's and return its area.

Example:

Input:
[
  ["1","0","1","0","0"],
  ["1","0","1","1","1"],
  ["1","1","1","1","1"],
  ["1","0","0","1","0"]
]
Output: 6
 */
public class MaximalRectangle {
    public int maximalRectangle(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int n = grid.length;
        if (n <= 0) {
            return 0;
        }
        int area, maxArea = 0;

        int[] bar = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    bar[j]++;
                } else if (grid[i][j] == 0) {
                    bar[j] = 0;
                }
            }
//            printArray(bar);
            area = maxHistogramArea(bar);
//            System.out.println("area = " + area);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public int maxHistogramArea(int[] bar) {
        int n = bar.length;
        int area, maxArea = 0;
        for (int i = 0; i < n; i++) {
            if (bar[i] == 0) {
                continue;
            }
            int minVal = bar[i];
            for (int j = i; j < n; j++) {
                if (bar[j] == 0) {
                    break;
                }
                if (bar[j] < minVal) {
                    minVal = bar[j];
                }
                if (bar[j] > minVal) {
                    area = minVal * (j - i + 1);
                } else {
                    area = Math.min(bar[j], bar[i]) * (j - i + 1);
                }
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        MaximalRectangle rect = new MaximalRectangle();

    }
}
