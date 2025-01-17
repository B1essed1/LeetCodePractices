package old.easy;

/**
* You are given an m x n integer grid accounts where accounts[i][j] is the amount
*  of money the i th customer has in
* the j th bank.
*  Return the wealth that the richest customer has.
*A customer's wealth is the amount of money they have in all their bank accounts.
*  The richest customer is the customer that has the maximum wealth.
**/



public class RichestCustomersWealth___Easy {
//    public static void main(String[] args) {
//        Integer[][] testAccaunt = {{1,5},{7,3},{3,5}};
//        Integer[][] testAccaunt2 = {{2,8,7},{7,1,3},{1,9,5}};
//        int[] forBinarySearch = {-1,0,3,5,9,12};
//       // System.out.println(reachestCustomer(testAccaunt2));
//        System.out.println(old.easy.BinarySearch___Easy.search(forBinarySearch,5));
//    }
     static Integer reachestCustomer(Integer[][] accounts){
        int max =0;
        for (Integer[] accaunt : accounts){
            int sumWealth = 0;
            for (Integer wealth: accaunt) {
                sumWealth +=wealth;
            }
            if (sumWealth > max) max = sumWealth;
        }
        return max;
    }
}
