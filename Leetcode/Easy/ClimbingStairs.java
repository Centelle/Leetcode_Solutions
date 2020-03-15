package Leetcode.Easy;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i < ans.length; i++){
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[ans.length- 1];
    }

    public static int climbStairs_recursive(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return climbStairs_recursive((n - 1)) + climbStairs_recursive(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("climbStairs_recursive(20) = " + climbStairs_recursive(45));
        System.out.println("climbStairs(45) = " + climbStairs(45));
    }
}
