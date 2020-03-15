package Leetcode.Easy;

/**
 * You are given an array coordinates, coordinates[i] = [x, y],
 * where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 */
public class CheckIfItIsaStraightLine {
    public boolean checkStraightLine(int[][] cd) {


        int x1 = cd[0][0], x2 = cd[1][0];
        int y1 = cd[0][1], y2 = cd[1][1];
        int s1 = x1 - x2;
        int s2 = y1 - y2;
        for (int i = 2; i < cd.length; i++) {
            x2 = x1 - cd[i][0];
            y2 = y1 - cd[i][1];
            if (x2 * s2 != y2 * s1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfItIsaStraightLine ob = new CheckIfItIsaStraightLine();
        int[][] myArray = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(ob.checkStraightLine(myArray));
        /*
         * String a = "[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]"; a= (a.replace("[", "{"));
         * System.out.println(a.replace("]", "}"));
         */
    }
}
