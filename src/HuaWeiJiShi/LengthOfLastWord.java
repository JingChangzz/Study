package HuaWeiJiShi;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/5/3.
 *
 *
 * 一行字符串的最后一个字符的长度
 */
public class LengthOfLastWord {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
 //       System.out.println(s);
        if (s.equals(" ") || s == null){
            System.out.println(0);
        }else {
            System.out.println(s.length());
            System.out.println(s.length() - s.lastIndexOf(" ") - 1);
        }

    }


}
