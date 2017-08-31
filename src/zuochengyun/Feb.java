package zuochengyun;

/**
 * Created by ZhangJing on 2017/8/31.
 *
 *
 * 斐波那契数列
 *
 * 1 2 3 5 8
 *
 * 下面的例子是稍稍变形
 * 1 2 3 4(1+3) 6(4+2) 9(6+3)
 */
public class Feb {

    /**
     * 时间复杂度，2的n次方
     * @param n
     * @return
     */
    private int feb1(int n) {

        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }

        return feb1(n - 1) + feb1(n - 3);
    }

    private int feb2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }

        int res = 3, pre = 2, prepre = 1;
        int temp1 = 0, temp2 = 0;

        for (int i = 4; i < n; i++) {
            temp1 = res;
            temp2 = pre;
            res = res + prepre;
            pre = temp1;
            prepre = temp2;
        }
        return res;
    }


}
