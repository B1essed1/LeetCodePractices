package nyu.easy;

/**
 * <h>1071. Greatest Common Divisor of Strings
 * <li> For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * <li>
 * <li> Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <li>
 * <li> Example 1:
 * <li>
 * <li> Input: str1 = "ABCABC", str2 = "ABC"
 * <li> Output: "ABC"
 * <li> Example 2:
 * <li>
 * <li> Input: str1 = "ABABAB", str2 = "ABAB"
 * <li> Output: "AB"
 * <li> Example 3:
 * <li>
 * <li> Input: str1 = "LEET", str2 = "CODE"
 * <li> Output: ""
 * <li>
 * <li> Constraints:
 * <li>
 * <li> 1 <= str1.length, str2.length <= 1000
 * <li> str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        // Check if concatenating in both orders gives the same result
       if (!str1.startsWith(str2)){
           return "";
       }

       int [] i1 = new int[str1.length()];
        // Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of length gcdLength from str1
        return str1.substring(0, gcdLength);
    }

    // Helper method to find the greatest common divisor of two integers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABVABVABVABVABVABVABVABV","ABV"));
    }
}
