/**
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * **/


package old.easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int right = s.length-1 , left = 0;
        char temp;
        while (left<right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
