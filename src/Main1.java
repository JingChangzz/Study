import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/26.
 *
 * didi 1
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] ins = in.split("   ");

        int[] input = new int[ins.length];
        for(int i=0;i<ins.length;i++){
            input[i]=Integer.parseInt(ins[i]);
        }
        System.out.println(max(input));
    }

    private static int max(int[] input){
//        int maxSum = 0;
//        int thisSum = 0;
//        for (int e : input) {
//            thisSum += e;
//            if (thisSum > maxSum) {
//                maxSum = thisSum;
//            } else if (thisSum < 0) {
//                thisSum = 0;
//            }
//        }
//        return maxSum;
    
    int result = Integer.MIN_VALUE, maxCur = 0;
        for(int i = 0; i < input.length; i++) {
        maxCur = Math.max(maxCur + input[i], input[i]);
        result = Math.max(maxCur, result);
    }
        return result;
    }
}
