package jianzhi_offer;

/**
 * Created by ZhangJing on 2017/3/16.
 *
 * 数n 中 1 的个数
 *
 * 利用与运算:
 * 因为对于 二进制， 每次减1，只有最后两位或1位会发生改变
 * （对于末位的10或01，因为进入循环后，立马对计数+1了）
 *
 * 剑指offer  p81
 */
public class NumberOf1 {

    public static int NumberOf1(int n){
        int result = 0;
        while(n != 0){

            result++;
            n = (n-1) & n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(3));
    }

}
