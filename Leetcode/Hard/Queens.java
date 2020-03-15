package Leetcode.Hard;

public class Queens {
    private long count;

    public long totalQueens(int n) {
        int[][] board = new int[n][n];
        solve(board, 0);
        return count;
    }

    void solve(int[][] board, int i) {
        int len = board.length;
        if (i == len) {
            count++;
            return;
        }

        for (int j = 0; j < len; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 1;
                solve(board, i + 1);
                board[i][j] = 0;
            }
        }
    }

    boolean isSafe(int[][] board, int i, int j) {
        if (board[i][j] == 1) {
            return false;
        }
        int len = board.length;
        for (int row = 0; row < i; row++) {
            if (board[row][j] == 1) {
                return false;
            }
        }

        for (int col = 0; col < j; col++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int k = 0; k < len; k++) {
            for (int l = 0; l < len; l++) {
                if ((k + l) == (i + j) || (k - l) == (i - j)) {
                    if (board[k][l] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    void printBoard(int[][] board) {
        int len = board.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Queens chess = new Queens();
        System.out.println("chess.totalQueens(n) = " + chess.totalQueens(15));
    }
}
