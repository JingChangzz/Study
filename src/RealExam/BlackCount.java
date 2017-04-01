package RealExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/8.
 *
 *
 */
public class BlackCount {

    public static void blackcount(int in){

        if (in <=0 || in >= 10000){
            return;
        }

        int num2 = getUpNum(everyNum(in));
        int num1 = getDownNum(everyNum(in));
        int cha =0;
        if(num1 - num2 == 0){
            System.out.println(num1 + " - " + "num2 =" + "0000");
        }else{

            while (num2 - num1 != 6174){
                cha = num2 - num1;
                System.out.println(num2 + " - " + num1 +" = " + cha);
                System.out.println();
                num2 = getUpNum(everyNum(cha));
                num1 = getDownNum(everyNum(cha));
            }
            cha = num2 - num1;
            System.out.println(num2 + " - " + num1 +" = " + cha);

            return;

        }

    }

    public static ArrayList<Integer> everyNum(int in){
        ArrayList<Integer> out = new ArrayList<>();
        int i = 0;

        while(in != 0){
            out.add(in%10);
            in  = in/10;
        }
        Collections.sort(out) ;
        return out;
    }

    public static int getDownNum(ArrayList<Integer> in){
        int length = in.size();
        int out = 0;
        for (int i = 0; i < length; i++){

            out = out * 10 + in.get(i);
        }

        return out;
    }

    public static int getUpNum(ArrayList<Integer> in){
        int length = in.size();
        int out = 0;
        for (int i = length-1; i >= 0; i--){

            out = out * 10 + in.get(i);
        }

        return out;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();

        blackcount(in);

        System.out.println(everyNum(in));
        System.out.println(getUpNum(everyNum(in)));
        System.out.println(getDownNum(everyNum(in)));
    }
}
