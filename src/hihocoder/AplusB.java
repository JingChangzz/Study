package hihocoder;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/5/4.
 */
public class AplusB {

    public static int plus(int A, int B) {

        return A+B;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(plus(A,B));

        }
    }
}
