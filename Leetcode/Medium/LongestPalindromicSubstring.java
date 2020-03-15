package Leetcode.Medium;

public class LongestPalindromicSubstring {

    public String longestSubstring(String s) {
        String ans = "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len_evenDigits = expandFromCenter(s, i, i + 1);
            int len_oddDigits = expandFromCenter(s, i, i);
            int maxLen = Math.max(len_evenDigits, len_oddDigits);
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
            
        }
        return s.substring(start, end + 1);
    }

    public int expandFromCenter(String s, int left, int right) {
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring ob = new LongestPalindromicSubstring();
        String s = "abc";
        System.out.println("ob.longestSubstring(s) = " + ob.longestSubstring(s));
    }

}
