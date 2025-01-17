/**
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 *
 * **/

package old.medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        //[1,2,3,4,5,5,6,7,8]
        //

        if (k> nums.length){
            k= k% nums.length;
        }
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - k, wi = -1;

            while (wi != nums.length - 1) {
                if (right < nums.length) {
                    wi++;
                    result[wi] = nums[right];
                    right++;
                } else {
                    wi++;
                    result[wi] = nums[left];
                    left++;
                }
            }

            System.arraycopy(result, 0, nums, 0, nums.length);
            for (int res : nums) {
                System.out.print(res + "\n");
            }

    }
}
