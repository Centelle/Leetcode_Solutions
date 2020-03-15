package Leetcode.Medium;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char toSearch = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == toSearch) {
                    if (expandInAllDirections(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean expandInAllDirections(char[][] board, int i, int j, String word, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (word.charAt(index) != board[i][j]) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        board[i][j] = ':';
        boolean exist;

        exist = (expandInAllDirections(board, i - 1, j, word, index + 1) ||
                expandInAllDirections(board, i + 1, j, word, index + 1) ||
                expandInAllDirections(board, i, j + 1, word, index + 1) ||
                expandInAllDirections(board, i, j - 1, word, index + 1));
        if (exist) {
            return true;
        }
        board[i][j] = word.charAt(index);
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'A'},
        };

        WordSearch game = new WordSearch();
        String word = "AA";
        System.out.println("game.exist(board, word) = " + game.exist(board, word));
    }
}