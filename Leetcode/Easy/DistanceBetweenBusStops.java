package Leetcode.Easy;

/**
 * A bus has n stops numbered from 0 to n - 1 that form a circle.
 * We know the distance between all pairs of neighboring stops where distance[i]
 * is the distance between the stops number i and (i + 1) % n.
 * The bus goes along both directions i.e. clockwise and counterclockwise.
 * <p>
 * Return the shortest distance between the given start and destination stops.
 * Input: distance = [1,2,3,4], start = 0, destination = 1
 * Output: 1
 * Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.
 * Input: distance = [1,2,3,4], start = 0, destination = 2
 * Output: 3
 * Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
 */
public class DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] stops, int start, int targeet) {
        int route1 = 0;
        int route2 = 0;
        int n = stops.length;
        /*for(int clockwise = start; clockwise < targeet; clockwise++){
            route1 = route1 + stops[clockwise];
        }*/
        int clockwise = start;
        while (clockwise != targeet) {
            route1 = route1 + stops[clockwise];
            if (clockwise == n - 1) {
                clockwise = 0;
            } else {
                clockwise++;
            }
        }
        int antiClockwise = targeet;
        while (antiClockwise != start) {
            route2 = route2 + stops[antiClockwise];
            if (antiClockwise == n - 1) {
                antiClockwise = 0;
            } else {
                antiClockwise++;
            }
        }
        System.out.println(route1 < route2 ? "route1 " : "route2");
        return Math.min(route1, route2);
    }

    public static void main(String[] args) {
        int[] stops = {7, 10, 1, 12, 11, 14, 5, 0};
        DistanceBetweenBusStops ob = new DistanceBetweenBusStops();
        System.out.println(ob.distanceBetweenBusStops(stops, 7, 2));
    }
}
