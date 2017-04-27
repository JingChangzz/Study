package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/27.
 */
public class baidu02 {

    public static void findMaxStrangle(String[][] points,int n){



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] points = new String[n][4];
        int numOf0=0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {

                points[i][j] = scanner.next();
                if (!points[i][j].equals("0"))
                    numOf0++;
//                System.out.println(i+","+j+":"+points[i][j]);
            }
        }

        if (numOf0 > n*4-3){
            System.out.println(0);
        }else {
            findMaxStrangle(points,n);
        }
    }


}
