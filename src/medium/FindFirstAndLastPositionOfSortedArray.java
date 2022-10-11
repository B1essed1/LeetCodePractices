/**
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 **/

package medium;

public class FindFirstAndLastPositionOfSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 1) {
            if (nums[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
            }
            return ans;
        }

        if (nums.length==0)
            return ans;

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) ans[1] = search(nums, target, false);
        return ans;
    }

    public static int search(int[] nums, int target, boolean isFirst) {
        int left =  0, right = nums.length-1;
        while (left<= right){
            int mid = left + (right-left)/2;
            if (target == nums[mid]){
                int ans = mid;
                  if (isFirst){
                      while (target == nums[ans]){
                          if (ans == 0)
                              return ans;
                          else ans--;
                      }
                      return ans+1;
                  } else {
                      while (target == nums[ans]){
                          if (ans == nums.length-1)
                              return ans;
                          else ans++;
                      }
                  }
                return ans-1;
            } else if (target> nums[mid]) left = mid+1;
            else if(target<nums[mid]) right = mid-1;
        }
        return -1;
    }
}
