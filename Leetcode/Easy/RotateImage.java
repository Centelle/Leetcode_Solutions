package Leetcode.Easy;

public class RotateImage {
    static int[][] rotateImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][n];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col ++){
                ans[row][col] = image[Math.abs(col - n + 1)][row];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray(rotateImage(mat));
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
