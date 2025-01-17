/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 **/

package old.easy;

public class ReverseWordsInString3 {
    public static String reverseWords(String s) {

        char[] words = s.toCharArray();
        int startIndex = 0, endIndex;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ' || i == words.length - 1) {
                if (i == words.length-1) endIndex = i; else endIndex = i - 1;
                char temp;
                while (startIndex < endIndex) {
                    temp = words[startIndex];
                    words[startIndex] = words[endIndex];
                    words[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                startIndex = i + 1;
            }

        }
        return String.valueOf(words);
    }
}
