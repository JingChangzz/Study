package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/11.
 */
public class xiecheng02 {

    public static void minF(int[] input){
        int[] correct = new int[]{1,2,3,4,5,6,7,8,0};
        int i=0;
        for (; i<9;i++){
            if (correct[i] == input[i])
                continue;
        }
        if (i==9){
            System.out.println(0);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[9];
        for (int i =0; i < 9;i++){

                input[i] = scanner.nextInt();

        }

        minF(input);
    }
}
