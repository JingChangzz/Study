package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/29.
 */
public class ALiJava {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int maxQps= Integer.valueOf(scanner.nextLine());
        String[] rts = scanner.nextLine().split(",");
        int requestAllNum = Integer.valueOf(scanner.nextLine());
        int threadAllNum = Integer.valueOf(scanner.nextLine());
        System.out.println(best(maxQps, rts, requestAllNum, threadAllNum));
    }

    public static long best(int maxQps,String[] rts,int requestNum,int threadNum) {
        //TODO
        int qpsSum = 0;
        for (int i =0; i< rts.length; i ++) {
            int singleMaxQps = threadNum * 1000 / Integer.valueOf(rts[i]);
            if (singleMaxQps > maxQps) {
                qpsSum += maxQps;
            }else {
                qpsSum += singleMaxQps;
            }
        }

        return requestNum / qpsSum * 1000;
    }

}
