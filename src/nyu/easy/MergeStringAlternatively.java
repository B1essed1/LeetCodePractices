package nyu.easy;


/**
 * <p>
 * 1768. Merge Strings Alternately
 * Easy
 * Topics
 * Companies
 * Hint
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * <p>
 * Example 1:
 *
 * <li> Input: word1 = "abc", word2 = "pqr"
 * <li> Output: "apbqcr"
 * <li> Explanation: The merged string will be merged as so:
 * <li> word1:  a   b   c
 * <li> word2:    p   q   r
 * <li> merged: a p b q c r
 * <li>
 * <p> Example 2:
 * <li> Input: word1 = "ab", word2 = "pqrs"
 * <li> Output: "apbqrs"
 * <li> Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * <li> word1:  a   b
 * <li> word2:    p   q   r   s
 * <li> merged: a p b q   r   s
 * <li>
 * <p> Example 3:
 * <li>
 * <li>Input: word1 = "abcd", word2 = "pq"
 * <li>Output: "apbqcd"
 * <li>Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * <li>word1:  a   b   c   d
 * <li>word2:    p   q
 * <li>merged: a p b q c   d
 * <li><p>
 * <li><p>
 * <li>Constraints:
 * <li><p>
 * <li>1 <= word1.length, word2.length <= 100
 * <li>word1 and word2 consist of lowercase English letters.
 **/
public class MergeStringAlternatively {

    public static String mergeAlternately(String word1, String word2) {

        boolean isFirstShort = word1.length() <= word2.length();
        return merge(word1, word2, isFirstShort);

    }

    //always word1 is smaller than word2
    private static String merge(String word1, String word2, boolean isFirstShort) {
        var length = isFirstShort ? word1.length() : word2.length();

        StringBuilder merged = new StringBuilder();
        for (int i = 0; i < length; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }
        if (word1.length() != word2.length()) {
            if (isFirstShort) {
                merged.append(word2.substring(length));
            } else {
                merged.append(word1.substring(length));
            }
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("bdf", "aaa"));
    }
}
