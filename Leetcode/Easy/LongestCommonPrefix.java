package Leetcode.Easy;

public class LongestCommonPrefix {
    public String getPrefix(String[] words) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < words[0].length(); i++) {
            char toCheck = words[0].charAt(i);
            if (isSame(words, toCheck, i)) {
                prefix.append(toCheck);
            } else {
                break;
            }
        }
        return prefix.toString();
    }

    private  boolean isSame(String[] words, char toCheck, int charIndex) {
        for (String word : words) {
            try {
                if (word.charAt(charIndex) != toCheck){
                    return false;
                }
            } catch (Exception e){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String [] words = {
                "Arin",
                "A",
                "Arnva",
        };

        LongestCommonPrefix ob = new LongestCommonPrefix();
        System.out.println("ob.getPrefix(words) = " + ob.getPrefix(words));
    }
}
