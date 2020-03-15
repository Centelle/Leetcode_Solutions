package Leetcode.Hard;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class TrappingRainWater {
    public int trap(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int mlh = 0;
        int mrh = 0;
        int l = 0;
        int r = n - 1; // here 4

        //first 0 < 4, second 1 < 4
        while (l < r) {
            mlh = Math.max(mlh, heights[l]); // first 1, second 1
            mrh = Math.max(mrh, heights[r]); // first 3, second 3
            res += mlh - heights[l];        // first 0, second 1
            res += mrh - heights[r];        // first 0, second 1
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TrappingRainWater ob = new TrappingRainWater();
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(ob.trap(nums));
    }
}
