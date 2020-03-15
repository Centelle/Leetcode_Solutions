package Leetcode.Easy;

public class MaxSubArraySum {
    /**
     * TODO
     * find subarray with maximum sum of elements and return the sum
     * @param nums array containing the elements
     */
    public int findMaxSum(int[] nums) {
        int currSum = 0, maxSum = 0;
        for (int num : nums) {
            currSum = Math.max(num, num + currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArraySum ob = new MaxSubArraySum();
        int[] nums = {1};
        System.out.println("ans = " + ob.findMaxSum(nums));
    }
}
