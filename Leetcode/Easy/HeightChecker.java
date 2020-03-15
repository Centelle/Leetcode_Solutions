package Leetcode.Easy;

import java.util.Arrays;

/**
 * Students are asked to stand in non-decreasing order of heights for an annual photo.

 * Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

 * Example 1:
 * <p>
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] heightsCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heightsCopy);
        int count = 0;
        for (int i = 0; i < heightsCopy.length; i++) {
            if (heights[i] != heightsCopy[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker ob = new HeightChecker();
        int[] nums = {1, 1, 4, 2, 1, 3};
        System.out.println(ob.heightChecker(nums));
    }
}
