package Leetcode.Easy;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOne ob = new MaxConsecutiveOne();
        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(ob.findMaxConsecutiveOnes(nums));
    }
}
