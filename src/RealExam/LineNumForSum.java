package RealExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/7.
 */
public class LineNumForSum {
    public static ArrayList<Integer> result = new ArrayList<>();
    public static String s = "";
//    public static void getLineNum(int sum, int count){
//
//        if(sum <1 || sum > Math.pow(10,9) || count <2 || count > 100){
//            System.out.println("No");
//            return;
//        }
//
//
//        for(int i =0; i < sum; i++){
//
//            if(sum%(count+i) == 0){
//
//                int num = count+i;//相加的个数
//                int midnum = sum/(count+i);
//                if(num%2 != 0){
//     、、、               result.add(num/2,midnum );
//                }
//                for(int k = 0; k < num/2;k++){
//                    result.add(k, midnum - num/2);
//                    result.add(k + num/2, midnum + num/2);
//                }
//                break;
//            }
//
//        }
//        System.out.print(result.get(0));
//        for (int j =1; j < result.size(); j++) {
//            System.out.print(" "+ result.get(j));
//        }
//
//    }

    public static void separateIntoItems(long n) {
        if (n <= 2) {
            System.out.println("No");
            return;
        }
        double max = Math.pow(2, 64);
        if ((double) n > max) {
            System.out.println("No");
            return;
        }
        boolean isExist = false;
        // a1 is the first number
        for (int a1 = 1; a1 <= n / 2; a1++) {
            // a2 is the last number
            for (int a2 = a1 + 1; a2 < n; a2++) {
                // if exist output the result
                if ((a1 + a2) * (a2 - a1 + 1) == n * 2) {
                    isExist = true;
  //                  System.out.print(a1);
                    s = s+ a1;
                    for (int t = a1 + 1; t <= a2; t++) {
                        //                     System.out.print(" " + t);
                       s = s + t;
                    }
    //                System.out.println();
                    s = s + "/";
                }
            }
        }
        if (!isExist) {
            System.out.println("No");
        }
       String[] An = s.split("/");
        System.out.print(An[An.length-1].charAt(0));
        for(int x=1; x < An[An.length-1].length(); x++){
            System.out.print(" "+ An[An.length-1].charAt(x));
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int count = scanner.nextInt();

        separateIntoItems(sum);
    }
}
