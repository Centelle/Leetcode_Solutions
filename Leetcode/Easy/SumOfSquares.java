package Leetcode.Easy;

public class SumOfSquares {
    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if ((i * i) + (j * j) == c) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean judgeSquareSum_improved(int num){
        int left = 0;
        int right = (int)(Math.sqrt(num));
        while(left <= right){
            int sum = left * left + right * right;
            if(sum == num){
                return true;
            }
            if(sum < num){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("judgeSquareSum_improved(4) = " + judgeSquareSum_improved(1));
    }
}
