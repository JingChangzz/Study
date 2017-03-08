package RealExam;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/2.
 *
 *给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
 *
 */
public class Netest_Deduplication {
    public static String removeDuplicates(String A) {
        int i = 1, j =0, num = 1;
        String result = "";
        if (A.length() == 0 || A.length() > 1000){
            return  null;
        }
        for(; i < A.length(); i++){
            if(String.valueOf(A.charAt(j)).equalsIgnoreCase(String.valueOf(A.charAt(i)))){
                num++;

            }else{
                result =result + num + A.charAt(j);
                j = j + num;
                num  = 1;
            }

        }
        result =result + num + A.charAt(i-1);
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();

        System.out.println(removeDuplicates(in));
    }

}
