package myTest;


import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/18.
 */
public class toutiao02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Double> set = new HashSet<>();
        boolean flag = true;
        int count=0;

        while (flag){
            double temp = scanner.nextDouble();

            if (temp > 0 && temp < Double.MAX_VALUE) {
                set.add(temp);
                count++;
            }
            else if (temp == 0) {
                flag = false;
            }else if (count > 1000000){
                break;
            }

        }
        System.out.println(set.size());

    }
}
