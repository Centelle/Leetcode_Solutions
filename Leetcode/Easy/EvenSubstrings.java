package Leetcode.Easy;

public class EvenSubstrings {

    public int numberOfEvenSubStrings(String input){
        int n = input.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            char ch = input.charAt(i);
            System.out.println("ch = " + ch);
            if(Integer.parseInt(Character.toString(ch)) % 2 == 0){
               ans += i + 1;;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        EvenSubstrings str = new EvenSubstrings();
        System.out.println("ans = " + str.numberOfEvenSubStrings("2342"));
    }
//98236
}
