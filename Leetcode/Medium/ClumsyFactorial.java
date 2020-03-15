package Leetcode.Medium;

public class ClumsyFactorial {
    /**
     * Normally, the factorial of a positive integer n is the product of all positive integers less than or equal to n.
     * For example, factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1.
     * <p>
     * We instead make a clumsy factorial: using the integers in decreasing order, we swap out the multiply operations
     * for a fixed rotation of operations: multiply (*), divide (/), add (+) and subtract (-) in this order.
     * <p>
     * For example, clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
     * However, these operations are still applied using the usual order of operations of arithmetic:
     * we do all multiplication and division steps before any addition or subtraction steps,
     * and multiplication and division steps are processed left to right.
     * <p>
     * Additionally, the division that we use is floor division such that 10 * 9 / 8 equals 11.
     * This guarantees the result is an integer.
     * <p>
     * Implement the clumsy function as defined above: given an integer N,
     * it returns the clumsy factorial of N.
     */

    public String clumsy(int n) {
        int fact = n, i, count = 0;
        String ans = "" + n;
        for (i = n; i >= 1; i--) {
            if (count == 1) {
                /*System.out.printf("i = %s  fact = %s", i, fact);
                fact = fact * (i);*/
                ans = ans + "*" + i;
            }
            if (count == 2) {
                /*System.out.printf("i = %s  fact = %s", i, fact);
                fact = fact / i;*/
                ans = ans + "/" + i;
            }
            if (count == 3) {
            /*    System.out.printf("i = %s  fact = %s", i, fact);
                fact = fact + i;*/
                ans = ans + "+" + i;
            }
            if (count == 4) {
                /*System.out.printf("i = %s  fact = %s", i, fact);
                fact = fact - i;*/
                ans = ans + "-" + i;
                count = 0;
            }
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1);
        ClumsyFactorial ob = new ClumsyFactorial();
        System.out.println((ob.clumsy(10)));
    }
}
