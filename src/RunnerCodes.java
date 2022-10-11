import collections.SinglyLinkedList;
import easy.*;
import medium.FindFirstAndLastPositionOfSortedArray;
import medium.RotateArray;
import medium.TwoSum2;

public class RunnerCodes {
    public static void main(String[] args) {

        int[] list = {1,3,5,6};
        Integer[] squareList = {-4,-1,0,3,10};
        int[] rotateList = {1,2,3};
        int[] nums = {0,0,2,3,4,5,6};
        int[] twoSumList = {2,7,11,15};
        int[] firstLastPosition = {2,2};
        int [] duplicates = {0,0,1,1,1,2,2,3,3,4};
        int [] duplicate2 = {1,1,2};

        // FirsBadVersion___Easy firsBadVersion___easy = new FirsBadVersion___Easy();
       // System.out.println(firsBadVersion___easy.firstBadVersion(2126753390));


       // System.out.println(SearchInsertionPosition.searchInsert(list,7));
//        for (Integer one: SquareOfSortedArray.squareOfSortedArray(squareList) ) {
//            System.out.print(one + " \n");
//
//        }

        //MoveZeroes.moveZeroes(nums);
      //  print(TwoSum2.twoSum(twoSumList,9));
       // System.out.println(ReverseWordsInString3.reverseWords("Let's take LeetCode contest"));
        //RotateArray.rotate(rotateList,4);
        //print(FindFirstAndLastPositionOfSortedArray.searchRange(firstLastPosition,2));
        //System.out.println(FirstUniqueCharacterInString.firstUniqChar("Leetcode"));

        System.out.println(RemoveDuplicatesFromSortedArray
                .removeDuplicates(duplicates));
    }

    public  static void print(int[] list){
        for (int t:list ) {
            System.out.print(t + "\t");
        }
    }
}
