package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/22.
 */
public class didi01 {

    public static String reverseWord(String s){

        return new StringBuffer(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] ss = s.split(" ");

//        for (int i = 0; i < ss.length; i++) {
//            System.out.println(ss[i]);
//        }

        for (int i = 0; i < ss.length; i++) {
            if(i == ss.length-1){
                System.out.print(reverseWord(ss[i]));
            }else{
                System.out.print(reverseWord(ss[i]) + " ");
            }

        }

    }
}
