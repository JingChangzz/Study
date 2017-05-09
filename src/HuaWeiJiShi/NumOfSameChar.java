package HuaWeiJiShi;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/5/4.
 *
 * 找出字符串中相同字符的个数，忽略大小写。
 *
 */
public class NumOfSameChar {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        s = s.toUpperCase();
        String same = scanner.nextLine();
        same = same.toUpperCase();
        int first = s.indexOf(same);
        int num=0;
        if (first != -1){
            num++;
            while(first < s.length()){
                first = s.indexOf(same, first+1);
                if (first != -1) num++;
                else break;
            }
        }
        System.out.println(num);
    }

}
