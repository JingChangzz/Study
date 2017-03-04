package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/2/28.
 *
 * 找出只出现一次的数字，其他的都出出现了3次
 *
 */
public class FindSingleOneFrom3 {
    public static int singleNumber(int[] A) {
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < A.length; ++i) {
            two |= one & A[i]; //出现两次的 就加到B里面
            one ^= A[i]; //从A里面删除 出现两次的
            three = one & two;  //如果是三次的 就会同时出现在A和B里面，
            one &= ~three; //然后删除A里三次的
            two &= ~three;  //删除B里三次的
        }
        return one;
    }
    public static void main(String[] args){
        int[] A = new int[]{1,2,3,4,3,4,1,4,1,3};

        System.out.println(singleNumber(A));
    }
}
