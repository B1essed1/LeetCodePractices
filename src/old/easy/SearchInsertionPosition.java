/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 **/


package old.easy;

public class SearchInsertionPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        // loop till the search space is exhausted
        while (low <= high) {
            // find the mid-value in the search space and
            // compares it with the target
            int mid = (low + high) / 2;

            // target value is found
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // if the target is less than the middle element, discard all elements
                // in the right search space, including the middle element
                high = mid - 1;
            } else {
                // if the target is more than the middle element, discard all elements
                // in the left search space, including the middle element
                low = mid + 1;
            }
        }
        return low;
    }
}
