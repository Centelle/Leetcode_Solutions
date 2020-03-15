package Leetcode.Easy;

public class CheckCrypticSolution {
    boolean isCryptSolution(String[] crypt, char[][] solution) {
        for (int i = 0; i < crypt.length; i++) {
            for (char[] chars : solution) {
                crypt[i] = crypt[i].replace(chars[0], chars[1]);
            }
            System.out.println("crypt = " + crypt[i]);
            if(crypt[i].charAt(0) == '0' && crypt[i].length() > 1){
                return false;
            }
        }
        return Long.parseLong(crypt[0]) + Long.parseLong(crypt[1]) == Long.parseLong(crypt[2]);
    }

    public static void main(String[] args) {
        CheckCrypticSolution ob = new CheckCrypticSolution();
        char[][] solution = {
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}
        };
        String[] crypt = {"SEND", "MORE", "MONEY"};
        System.out.println(ob.isCryptSolution(crypt, solution));
    }
}
