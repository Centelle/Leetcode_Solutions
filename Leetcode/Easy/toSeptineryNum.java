package Leetcode.Easy;

/**
 * Given an integer, return its base 7 string representation.
 * <p>
 * Example 1:
 * Input: 100
 * Output: "202"
 * Example 2:
 * Input: -7
 * Output: "-10"
 */
public class toSeptineryNum {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String ans = "";
        int t = Math.abs(num);
        int a = 0;
        while (t > 0) {
            a = t % 7;
            ans = a + ans;
            t = t / 7;
        }
        if (num < 0) {
            return "-" + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        toSeptineryNum obj = new toSeptineryNum();
        System.out.println(obj.convertToBase7(0));

    }

}

