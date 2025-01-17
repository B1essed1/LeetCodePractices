/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */

package old.easy;

public class SquareOfSortedArray {
    public static int[] squareOfSortedArray(Integer[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1, wi = nums.length - 1;
        while (right >= left) {
            int ls = nums[left] * nums[left];
            int rs = nums[right] * nums[right];
            if (rs > ls) {
                result[wi] = rs;
                wi--;
                right--;
            } else {
                result[wi] = ls;
                wi--;
                left++;
            }
        }
        return result;
    }
}
