package Leetcode.Medium;

/**
 * Some people will make friend requests. The list of their ages is given and ages[i] is the age of the ith person.
 * <p>
 * Person A will NOT friend request person B (B != A) if any of the following conditions are true:
 * <p>
 * age[B] <= 0.5 * age[A] + 7
 * age[B] > age[A]
 * age[B] > 100 && age[A] < 100
 * Otherwise, A will friend request B.
 * <p>
 * Note that if A requests B, B does not necessarily request A.  Also, people will not friend request themselves.
 * <p>
 * How many total friend requests are made?
 * <p>
 * Example 1:
 * <p>
 * Input: [16,16]
 * Output: 2
 * Explanation: 2 people friend request each other.
 * Example 2:
 * <p>
 * Input: [16,17,18]
 * Output: 2
 * Explanation: Friend requests are made 17 -> 16, 18 -> 17.
 * Example 3:
 * <p>
 * Input: [20,30,100,110,120]
 * Output:
 * Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
 */
public class FriendsOfAppropriateAges_TimeExceeded {
    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int personsAge = ages[i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                /*
                age[B] <= 0.5 * age[A] + 7
                age[B] > age[A]
                age[B] > 100 && age[A] < 100
                */
                if (!(ages[j] <= 0.5 * personsAge + 7 || ages[j] > personsAge || ages[j] > 100 && personsAge < 100)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FriendsOfAppropriateAges_TimeExceeded ob = new FriendsOfAppropriateAges_TimeExceeded();
        int[] myNums = {16, 16};
        System.out.println(ob.numFriendRequests(myNums));
    }
}
