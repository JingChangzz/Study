package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/1.
 *
 *
 * 大字符串相乘
 */
public class pinduoduo2 {


    public static String multi(String s1, String s2){

        int r1 = s1.length()>s2.length()?s1.length():s2.length();
        int r2 = s1.length()<s2.length()?s1.length():s2.length();
        String[] result = new String[r1+r2];
        for (int i=0; i < result.length; i++){
            result[i]="0";
        }

        for (int i = r1-1, r=r1+r2-1; i>=0; --i,--r){
            for (int j=r2-1,k=r; j>=0; --j,--k){
                int rk = Integer.parseInt(result[k]);
                int si = Character.getNumericValue(s1.charAt(i));
                int sj = Character.getNumericValue(s2.charAt(j));
                result[k] = String.valueOf( rk + (si * sj));
                int temp = Integer.parseInt(result[k]) / 10;
                if (temp>1){
                    result[k-1] = String.valueOf(Integer.parseInt(result[k-1]) + temp);
                    result[k] = String.valueOf(Integer.parseInt(result[k]) - temp*10);
                }
            }
        }

       // result[r1+r2] = "/0";

        StringBuffer s4 = new StringBuffer();
        if(result[0] == "0"){
            for (int i =1; i< result.length; i++){
                s4.append(result[i]);
            }
        }else{
            for (String string : result) {
                s4.append(string);
            }
        }
        return s4.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input  = scanner.nextLine();

        if (input.split(" ").length != 2){
            System.out.println("0");
        }else{
            String input1 = input.split(" ")[0];
            String input2 = input.split(" ")[1];

            if(input1=="0" || input2=="0"){
                System.out.println("0");
                return;
            }
            System.out.println(multi(input1,input2));
        }

    }

}
