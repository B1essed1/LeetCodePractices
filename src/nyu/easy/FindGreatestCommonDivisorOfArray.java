package nyu.easy;
/**
 *<li>1979. Find Greatest Common Divisor of Array
 *<li>Easy
 *<li>Topics
 *<li>Companies
 *<li>Hint
 *<li>Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 *
 *<li>The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 *  */
public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }

        while(minimum!=0){
            int temp = minimum;

            minimum = maximum % minimum ;
            maximum = temp;
        }

        return maximum;

    }

    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArray solution = new FindGreatestCommonDivisorOfArray();
        int[] nums = {2,5,6,9,10};
        System.out.println(solution.findGCD(nums)); // Output: 8
    }
}
