package Leetcode.Medium;

import java.util.HashSet;

public class LongestSubstringWithUniqueChars {

    int getLength(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                right++;
                max = Math.max(max, uniqueChars.size());
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "ABCDDEFGH";
        LongestSubstringWithUniqueChars ob = new LongestSubstringWithUniqueChars();
        System.out.println("ob.getLength(s) = " + ob.getLength(s));
    }
}
