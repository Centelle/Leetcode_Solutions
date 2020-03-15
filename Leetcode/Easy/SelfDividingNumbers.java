package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;


/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ansList = new ArrayList<>();
        int i = 0;
        for (int num = left; num <= right; num++) {
            if(isSelfDividing(num)){
                ansList.add(num);
            }
        }
        return ansList;
    }

    public boolean isSelfDividing(int num) {
        int temp = num;
        int a = 0;
        while (temp != 0) {
            a = temp % 10;
            if (a == 0 || num % a != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers ob = new SelfDividingNumbers();
        System.out.println(ob.selfDividingNumbers(1000, 2392020));
    }

}
