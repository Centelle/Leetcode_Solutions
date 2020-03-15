package Leetcode.Easy;

import java.util.HashMap;

/**
 * Given a string s consisting of small English letters, find and return the first instance of a non-repeating character
 * in it. If there is no such character, return '_'.
 * <p>
 * Example
 * <p>
 * For s = "abacabad", the output should be
 * firstNotRepeatingCharacter(s) = 'c'.
 * <p>
 * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
 * <p>
 * For s = "abacabaabacaba", the output should be
 * firstNotRepeatingCharacter(s) = '_'.
 * <p>
 * There are no characters in this string that do not repeat.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string s
 * <p>
 * A string that contains only lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s.length ≤ 105.
 * <p>
 * [output] char
 * <p>
 * The first non-repeating character in s, or '_' if there are no characters that do not repeat.
 */
public class FirstNonRepeatingChar {
    char findNotRepeatingCharacter(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCounts.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }
}
