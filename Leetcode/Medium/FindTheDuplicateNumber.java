package Leetcode.Medium;

/**
 * Given an array nums containing n + 1 integers where each integer is
 * between 1 and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,4,2,2]
 * Output: 2
 * Example 2:
 * <p>
 * Input: [3,1,3,4,2]
 * Output: 3
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int duplicate = 0;
        for (int i = 0; i < n; i++) {
            int checkDuplicate = nums[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    if (nums[j] == nums[i]) {
                        duplicate = nums[i];
                    }
                }
            }
        }
        return duplicate;
/*        Arrays.sort(nums); // not applicable as array should not transformed
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return -1;*/
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber ob = new FindTheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(ob.findDuplicate(nums));
    }
}
