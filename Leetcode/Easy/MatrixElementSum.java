package Leetcode.Easy;

public class MatrixElementSum {
    int getMatrixElementsSum(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > 0) {
                    count += mat[j][i];
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MatrixElementSum ob = new MatrixElementSum();
        int[][] mat = {
                {0, 0, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}
        };
        System.out.println("ob.getMatrixElementsSum(mat) = " + ob.getMatrixElementsSum(mat));
        double n = Math.sin(90);
    }

}
