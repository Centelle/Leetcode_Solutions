package Leetcode.Medium;

public class BestSightseeingPair_TimeExceeded {
    /**
     * Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot,
     * and two sightseeing spots i and j have distance j - i between them.
     * <p>
     * The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) :
     * the sum of the values of the sightseeing spots, minus the distance between them.
     * <p>
     * Return the maximum score of a pair of sightseeing spots.
     */
    public int maxScoreSightseeingPair(int[] spots) {
        int n = spots.length;
        int ans, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { //try both
                if ((spots[i] + spots[j] + i - j) > max) {
                    max = spots[i] + spots[j] + i - j;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BestSightseeingPair_TimeExceeded ob = new BestSightseeingPair_TimeExceeded();
        int[] spots = {8, 1, 5, 2, 6};
        System.out.println(ob.maxScoreSightseeingPair(spots));
    }
}
