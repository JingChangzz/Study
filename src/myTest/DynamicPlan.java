package myTest;

/**
 * Created by ZhangJing on 2017/5/24.
 *
 *
 * 动态规划
 *
 * 有几种面值的钱，
 * 组成总和num
 *
 * 多少种方法
 */
public class DynamicPlan {
    /**
     *
     * @param penny 各种面值
     * @param n     面值种数
     * @param aim   目标值
     * @return      总方法数
     */
    public static int countWays(int[] penny, int n, int aim) {
        // write code here
        if(n==0||penny==null||aim<0){
            return 0;
        }
        int[][] pd = new int[n][aim+1];
        for(int i=0;i<n;i++){
            pd[i][0] = 1;
        }
        for(int i=1;penny[0]*i<=aim;i++){
            pd[0][penny[0]*i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=aim;j++){
                if(j>=penny[i]){
                    pd[i][j] = pd[i-1][j]+pd[i][j-penny[i]];
                }else{
                    pd[i][j] = pd[i-1][j];
                }
            }
        }
        return pd[n-1][aim];
    }

    public static void main(String[] args) {

        int[] penny = new int[]{1,2,5,10,50};
        System.out.println(countWays(penny,5,4));
    }

}
