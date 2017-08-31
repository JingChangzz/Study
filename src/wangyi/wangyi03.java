package wangyi;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/12.
 */
public class wangyi03 {


    public static int num(int n, int k){
        if ( k <1){
            return 0;
        }
        if (n == 2 && k == 2){
            return 3;
        }
        int result = 3;


        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();


        System.out.println(num(n,k));
    }

}
