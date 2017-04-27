package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/7.
 */
public class jingdong01 {
    public static int[] a=new int[100];
    static double[] result = {1};

    public static void ratePass(int num, int[] pi, double passNum){

        if(num == 0){
            return;
        }else if (num == 1){
            System.out.println(pi[0]);
            return;
        }


        for(int i = 2; i< passNum ; i++) {
           comb(pi, a, num, i);
        }
    }


    /**
     * 组合问题： 输出从数组a的n个元素中选出m个元素的组合
     * @param a	给定数组
     * @param b	组合结果  (b中存放的是元素在a中的编号)
     * @param n
     * @param m
     *
     * 思路：1.从n个元素中选出序号最大的数，然后在剩下的(n-1)个元素中选(m-1)个
     * 	  当m=1时，倒序输出数组b；
     *      2.从n个元素中选出编号次小的数，重复第1步。
     */
    public static double comb( int[] a, int[] b, int n, int m){

        for( int i=n; i>=m; i--){
            b[m-1] = i-1;
            if( m>1 ){
                comb(a,b,i-1,m-1);
            }else{
                for( int j=0; j<m; j++ ){
                    result[m] = result[m] * a[b[j]];
                    if( j==0 )
                        continue;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] pi = new int[num];
        for (int i =0; i < num; i++){
            pi[i] = scanner.nextInt();
        }

        double passNum = num * 0.6;

        ratePass(num,pi,passNum);
    }
}
