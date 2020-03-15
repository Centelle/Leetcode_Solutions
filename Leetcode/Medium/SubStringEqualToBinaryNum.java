package Leetcode.Medium;

public class SubStringEqualToBinaryNum {


    public boolean otherMethod(String S, int N) {
        for (int i = 1; i <= N; i++) {
            if (!S.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        SubStringEqualToBinaryNum obj = new SubStringEqualToBinaryNum();
        System.out.println(obj.otherMethod("00011011111000000", 9));
    }
}
