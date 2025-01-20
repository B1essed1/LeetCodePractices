package nyu.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *<li> 1431. Kids With the Greatest Number of Candies

 *<li> There are n kids with candies. You are given an integer array candies,
 *  where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *<li> Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *<li> Note that multiple kids can have the greatest number of candies.
 * */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i=0; i<candies.length; i++){
            if(max<candies[i]) {
                max = candies[i];
            }
        }
        List<Boolean> list =  new ArrayList(candies.length);
        for(int i = 0;i < candies.length; i++){
            list.add((candies[i]+extraCandies)>=max);
        }
        return list;

    }
}
