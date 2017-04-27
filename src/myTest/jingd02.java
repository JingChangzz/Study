package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/7.
 */
public class jingd02 {

    public static void solve(String s){
        int result =0;
        if(s.length() <= 1){
            System.out.println(0);
        }

        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'X'){
                continue;
            } else if (s.charAt(i) == '#') {
                continue;
            }else{
                for (int j = 0; j < (int)s.charAt(i);j++){
                    if(i-j>= 0 && s.charAt(i-j) == 'X'){
                        result++;
                    }
                    if (i+j < s.length() && s.charAt(i+j) == 'X'){
                        result++;
                    }
                    System.out.println(result);
                }

            }
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = scanner.next();


        solve(s);
    }
}
