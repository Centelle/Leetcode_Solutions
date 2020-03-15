package Leetcode.Hard;

import java.util.HashSet;
/*
 * Given an unsorted integer array, find the smallest missing positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,0]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [3,4,-1,1]
 /**
 * Output: 2
 * Example 3:
 * <p>
 * Input: [7,8,9,11,12]
 * Output: 1
 */
public class FirstMissingPositive {

    public int firstMissingPositive_improved(int [] nums){
        HashSet <Integer> uniqueNumbers = new HashSet<>();
        for(int number : nums){
            uniqueNumbers.add(number);
        }
        for(int i = 1; i < nums.length  + 1; i++){
            if(!uniqueNumbers.contains(i)){
                return i;
            }
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive ob = new FirstMissingPositive();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("ob.firstMissingPositive_improved(nums) = " + ob.firstMissingPositive_improved(nums));
    }
}
