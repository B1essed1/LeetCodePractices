package nyu.easy;

/**
 * <h>You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * <li>Given an integer array flowerbed containing 0's and 1's,
 * <li>where 0 means empty and 1 means not empty, and an integer n, return true
 * <li>if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int freePaces = 0;
        int counter = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                counter++;
                if (i== flowerbed.length - 1 && counter>=3) {
                    freePaces += (counter - 1) / 2+1;
                }
            } else {
                if (counter >= 3) {
                    freePaces += (counter - 1) / 2;
                }
                counter = 0;
            }
        }
        System.out.println("fre-----> " + freePaces);
        return freePaces >= n;

    }

    //[001000000000]
    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1,0,0}, 1));
    }
}
