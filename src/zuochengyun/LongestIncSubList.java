package zuochengyun;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/29.
 *
 * 最长递增子序列
 *
 * dp记录的是以i为下标的 arr[i] 为结尾的最长递增子序列的 长度
 *
 * 输入：
 * 6（个数）
 2
 5
 1
 5
 4
 5
 */
public class LongestIncSubList {

    public static int[] gen(int[] arr, int[] dp) {
        int len =0, index=0;
        for (int i =0; i<dp.length;i++) {
            if (dp[i] > len){
                len = dp[i];
                index = i;
            }
        }
        int[] lis = new int[len];
        lis[--len] = arr[index];
        for (int i=index; i>=0;i--){
            if (arr[i]<arr[index] && dp[i]==dp[index]-1){
                lis[len--] = arr[i];
                index=i;
            }
        }
        return lis;
    }


    public static int[] getDP(int[] arr) {
        int[] dp = new int[arr.length], ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;

        int right = 0, l =0, r=0, m=0;

        for (int i = 1; i < arr.length; i++) {
            l=0;
            r=right;
            while (l<=r) {
                m = (l+r)/2;
                if (arr[i] > ends[m]){
                    l = m + 1;
                }else{
                    r=m-1;
                }
            }
            right = Math.max(right,l);
            ends[l] = arr[i];
            dp[i] = l+1;
        }
        return dp;
    }

    public static int[] list(int[] arr) {
        if (arr == null || arr.length==0){
            return null;
        }
        int[] dp = getDP(arr);

        return gen(arr,dp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] input = new int[length];
        for (int i =0; i < length ;i++){
            input[i] = scanner.nextInt();
        }

        System.out.println(list(input).length);
    }

}
