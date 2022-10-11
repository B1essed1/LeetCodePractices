package easy;

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 **/


public class BinarySearch___Easy {

    public static int search(int[] nums, int target) {
        int low = 0, mid;
        int high = nums.length-1;
        while(low <= high){
            mid = low + (high-low)/2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }


}
