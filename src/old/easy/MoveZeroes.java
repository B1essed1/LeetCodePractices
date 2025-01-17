/**
 *
 *
 *Given an integer array nums,
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.**/


package old.easy;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int lastNonZero = 0;
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] !=0){
                nums[lastNonZero++] = nums[j];
            }
        }
        for (int i = lastNonZero; i <nums.length ; i++) {
            nums[i] =0;
        }

    }
}
