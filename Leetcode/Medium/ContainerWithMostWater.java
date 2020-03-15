package Leetcode.Medium;

/**
 * Given n non-negative integers a1, a2, ..., an ,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length, length, width, area = 0, maxArea = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
                if (j == i) {
                    continue;
                }
                if (j < i) {
                    length = Math.min(height[i], height[j]);
                    width = Math.abs(i - j);
                    area = length * width;

                }
                maxArea = Math.max(maxArea, area);
//                System.out.println("maxArea = " + maxArea);
            }
        }
        return maxArea;
    }
    /*        public int maxArea(int[] height) {
            int maxArea = Integer.MIN_VALUE;
            int i = 0;
            int j = height.length - 1;
            while (i < j) {
                maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return maxArea;
        }*/

    public static void main(String[] args) {
        ContainerWithMostWater ob = new ContainerWithMostWater();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(ob.maxArea(nums));
    }
}
