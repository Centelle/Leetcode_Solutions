package Leetcode.Easy;

/**
 * Given an array A of non-negative integers,
 * return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                ans[index] = nums[i];
                index++;
            }
        }
        /*for (int j = 0; j < n; j++) {
            System.out.println(ans[j]);
        }*/
        return ans;
    }

    public static void main(String[] args) {
        SortArrayByParity ob = new SortArrayByParity();
        int[] check = {2, 4, 0, 9, 6, 5, 4};
        ob.sortArrayByParity(check);
    }
}
