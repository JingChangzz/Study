package myTest;
import java.util.Scanner;
/**
 * Created by me on 16-1-21.
 */
public class Cals {
    boolean[] result;

    public static void main(String[] args) {
        Cals main = new Cals();
        main.input();
        main.output();
    }

    private void input(){
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        long[] current = new long[3];
        result = new boolean[total];

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < current.length; j++) {
                current[j] = input.nextLong();
            }
            if(isBigger(current[0] + current[1], current[2])){
                result[i] = true;
            }else {
                result[i] = false;
            }
        }
    }

    private boolean isBigger(long num1, long num2) {
        if(num1 > num2)
            return true;
        else
            return false;
    }

    private void output(){
        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + (i+1) + ": " + result[i]);
        }
    }
}