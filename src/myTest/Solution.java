package myTest;

/**
 * Created by ZhangJing on 2017/2/17.
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        boolean found = false;

        if(array != null && array.length > 0 && array[0].length > 0){
            int rows = array.length;
            int colnums = array[0].length;
            int row = 0;
            int colnum = colnums - 1;

            while(row < rows && colnum > 0){
                if(array[row][colnum] == target){
                    found = true;
                    break;
                }else if(array[row][colnum] > target){
                    --colnum;
                }else{
                    ++row;
                }
            }
        }

        return found;
    }

    public static void main ( String arg[] ) {
        Integer first = new Integer(3);
        Integer second = 128;
        int three = 3;
        Integer four = 128;
        System.out.println(first==second);
        System.out.println(first==three);
        System.out.println(second==three);
        System.out.println(four==second);

        String A = "abc";
        String B = new String("abc");
        System.out.println(A==B);

    }

}