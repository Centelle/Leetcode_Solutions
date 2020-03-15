package Leetcode.Easy;

/** TODO
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * Example 1:
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] input) {
        int n = input.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(input[left]) > Math.abs(input[right])) {
                ans[i] = input[left] * input[left];
                left++;
            } else {
                ans[i] = input[right] * input[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SquaresofaSortedArray ob = new SquaresofaSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        ob.printArray(ob.sortedSquares(nums));
    }

    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "  ");
        }
    }
}
