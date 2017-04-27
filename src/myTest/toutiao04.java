package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/18.
 */
public class toutiao04 {

    public static String[][] getValue(String s){
        if (s.equals("_1")){
            return _1;
        }else if (s.equals("_2")){
            return _2;
        }else if (s.equals("_3")){
            return _3;
        }else if (s.equals("_4")){
            return _4;
        }else if (s.equals("_5")){
            return _5;
        }else if (s.equals("_6")){
            return _6;
        }else if (s.equals("_7")){
            return _7;
        }else if (s.equals("_8")){
            return _8;
        }else if (s.equals("_9")){
            return _9;
        }else if (s.equals("_0")){
            return _0;
        }else if (s.equals("plus")){
            return plus;
        }else if (s.equals("dec")){
            return dec;
        }else if (s.equals("cheng")){
            return cheng;
        }else if (s.equals("chu")){
            return chu;
        }else if (s.equals("dengyu")){
            return dengyu;
        }else if (s.equals("point")){
            return point;
        }
        return null;
    }

   static String[][] _1 = {{"*"},{"*"},{"*"},{"*"},{"*"}};
    static String[][] _2 = {{"***"},{"  *"},{"***"},{"*  "},{"***"}};
    static String[][] _3 = {{"***"},{"  *"},{"***"},{"  *"},{"***"}};
    static String[][] _4 = {{"* *"},{"* *"},{"***"},{"  *"},{"  *"}};
    static String[][] _5 = {{"***"},{"*  "},{"***"},{"  *"},{"***"}};
    static String[][] _6 = {{"***"},{"*  "},{"***"},{"* *"},{"***"}};
    static String[][] _7 = {{"***"},{"  *"},{" *"},{"  *"},{"  *"}};
    static String[][] _8 = {{"***"},{"* *"},{"***"},{"* *"},{"***"}};
    static String[][] _9 = {{"***"},{"* *"},{"***"},{"  *"},{"***"}};
    static String[][] _0 = {{"***"},{"* *"},{"* *"},{"* *"},{"***"}};

    static String[][] plus = {{"   "},{" * "},{"***"},{" * "},{"   "}};
    static String[][] dec = {{"   "},{"   "},{"***"},{"   "},{"   "}};
    static String[][] cheng = {{"   "},{"* *"},{" * "},{"* *"},{"   "}};
    static String[][] chu = {{"   "},{"  *"},{" * "},{"*  "},{"   "}};
    static String[][] dengyu = {{"    "},{"****"},{"    "},{"****"},{"    "}};
    static String[][] point = {{"  "},{"  "},{"***"},{"**"},{"**"}};






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] input = s.split(" ");

        if (input.length < 3){
            return;
        }

        int n1 = Integer.getInteger(input[0]);
        String f = input[1];
        int n2 = Integer.getInteger(input[2]);
        float an=0;

        if (f.equals("+")){
            an = n1 + n1;
        }else if (f.equals("-")){
            an = n1 - n1;
        }else if (f.equals("*")){
            an = n1 * n1;
        }else if (f.equals("/")){
            an = n1 / n1;
        }

        String nn = String.valueOf(n1);
        String nm = String.valueOf(n2);
        String na = String.valueOf(an);

        for(int hang =0; hang < 5; hang++){

            for (int i=0;i< nn.length();i++) {
                System.out.println(getValue("_" + nn.charAt(i))[hang][0] +"  ");
            }
            System.out.println(getValue(f)[hang][0]+"  ");
            for (int i=0;i< nm.length();i++) {

                System.out.println(getValue("_" + nm.charAt(i))[hang][0]+"  ");
            }
            System.out.println(getValue("dengyu")[hang][0]+"  ");
            for (int i=0;i< na.length();i++) {

                if (na.charAt(i) != '.'){
                System.out.println(getValue("_" + na.charAt(i))[hang][0]+"  ");
                }else{
                    System.out.println(getValue("point") +"  ");
                }
            }

        }
    }
}
