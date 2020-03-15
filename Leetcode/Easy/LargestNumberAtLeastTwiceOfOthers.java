package Leetcode.Easy;

/**
 * In a given integer array nums, there is always exactly one largest element.
 * <p>
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * <p>
 * If it is, return the index of the largest element, otherwise return -1.
 */
@SuppressWarnings("CStyleArrayDeclaration")
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex) {
                continue;
            }
            if (nums[i] * 2 > max) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers obj = new LargestNumberAtLeastTwiceOfOthers();
        int myArray[] = {1, 2, 4, 3, 50};
        System.out.println(obj.dominantIndex(myArray));
    }
}
