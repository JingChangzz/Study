package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/2/28.
 *
 *
 * Given an array of integers, every element appears twice except for one.
 * Find that single one
 * 有一个数只出现一遍，找出这个数。
 Note:
 Your algorithm should have a linear runtime complexity.
 Could you implement it without using extra memory?
 *
 *思路：异或，相异为一。
 * */
public class FindSingleOne {

    public static int singleNumber(int[] A) {
        int result = A[0];
        for (int i = 1; i<A.length; i++){
            result =  result^A[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] A = new int[]{1,2,3,4,3,4,1};

        System.out.println(singleNumber(A));
    }
}
