package Leetcode.Easy;

public class HalloweenGifts_Hackerrank {
    /**
     *
     Usually, all games are sold at the same price,p dollars. However, they are planning to have the seasonal
     Halloween Sale next month in which you can buy games at a cheaper price. Specifically, the first game
     you buy during the sale will be sold at  p dollars, but every subsequent game you buy will be sold at
     exactly d dollars less than the cost of the previous one you bought. This will continue until the cost
     becomes less than or equal to m dollars, after which every game you buy will cost dollars each.
     */
    public int num_gifts(int p, int d, int m, int s) {
        int count = 0;
        while (true) {
            if (s - p >= 0) {
                s = s - p;
                count++;
            } else {
                break;
            }
            p = Math.max(p - d, m);
        }
        return count;
    }

    public static void main(String[] args) {
        HalloweenGifts_Hackerrank ob = new HalloweenGifts_Hackerrank();
        System.out.println("ob.num_gifts(20, 3, 6, 80) = " + ob.num_gifts(20, 3, 6, 80));
    }
}
