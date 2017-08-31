package zuochengyun;

/**
 * Created by ZhangJing on 2017/8/31.
 *
 * 矩阵的最小路径和， 空间复杂度O(M*N)
 *
 * eg：
 * 1 3 5 9
 * 8 1 3 4
 * 5 0 6 1
 * 8 8 4 0
 *
 * 思路1：
 * 生成dp矩阵，和输入矩阵一样大小
 * 第一行默认值，即00 -> 01 -> 02 -> 03
 * 第一列默认值，即10 -> 20 ->30 -> 40
 * 1 4 9 18
 * 9
 * 14
 * 22
 */
public class ShortestLengthOfMatric {

    /**
     * 空间复杂度 M*N
     * @param m
     * @return
     */
    private int minPathSum1(int[][] m) {

        if (m == null || m.length == 0 || m[0] == null || m[0].length ==0) {
            return 0;
        }

        int row = m.length;
        int col = m[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = m[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i-1][0] + m[i][0];
        }
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j-1] + m[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + m[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }

    /**
     * 每计算一行（列），更新arr[]的值
     * 最后得到的是最后一行（列）的值
     *
     * 时间复杂度一样，空间复杂度为min{M,N}
     * @param m
     * @return
     */
    private static int minPathSum2(int[][] m) {

        if (m == null || m.length == 0 || m[0] == null || m[0].length ==0) {
            return 0;
        }
        int more = Math.max(m.length, m[0].length);
        int less = Math.min(m.length, m[0].length);

        boolean rowmore = more == m.length; //行<列
        int[] arr = new int[less];  //辅助数组
        arr[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            arr[i] = arr[i-1] + (rowmore? m[i][0]:m[0][i]);
        }
        for (int i = 1; i < more; i++) {
            arr[0] = arr[0] + (rowmore? m[i][0]:m[0][i]);
            for (int j = 1; j < less; j++) {
                arr[j] = Math.min(arr[j-1], arr[j]) + (rowmore? m[i][j]:m[j][i]);
            }
        }

        return arr[less-1];

    }

    public static void main(String[] args) {
        int[][] in = new int[][]{{1,3,5,9},
                {8,1,3,4},
                {5,0,6,1}};
        minPathSum2(in);

    }
}
