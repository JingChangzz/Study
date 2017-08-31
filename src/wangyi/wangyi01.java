package wangyi;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/12.
 */
public class wangyi01 {

    public static int day(int x, int f, int d, int p){
        if(x < 1 || f<1|| d<1 || p > 2*1000000000){
            return 0;
        }

        int result = 0;

        result = (d+f*p)/(x+p);

        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int f = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println(day(x,f,d,p));
    }
}
