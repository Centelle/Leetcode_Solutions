package Leetcode.Medium;

import java.util.HashMap;

public class SingleNumber_II {
    public int getSingleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
                if (map.get(val) == 3) {
                    map.put(val, 0);
                }
            } else {
                map.put(val, 1);
            }
        }
        for(int val : nums){
            if(map.get(val) == 1){
                return val;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleNumber_II ob = new SingleNumber_II();
        int[] nums = {0, 0, 0, 3, 2, 2, 2, 3, 3, 5, 6, 5, 5};
        System.out.println("ob.getSingleNumber(nums) = " + ob.getSingleNumber(nums));
        int xmas = 100;
        System.out.println("x = " + xmas);
    }
}
