package RealExam;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/25.
 */
public class LastTime {


    public static int[] taxi(int[][] point,int num){

        int[] result = new int [num];
        for (int i =0; i< num; i++){
            int walk = (Math.abs(point[i][0]) + Math.abs(point[i][1]) ) * point[num+1][0];
            int taxi = (Math.abs(point[num][0] -  point[i][0]) + Math.abs(point[num][1] - point[i][1]) ) * point[num+1][1];
            result[i] = walk + taxi;
        }

        return result;
    }

    public static int foot(int x, int y,int walkspeed){

        int result = (Math.abs(x) + Math.abs(y) ) * walkspeed;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] data = new int[num+2][2];
        for (int i= 0; i< num + 2; i++){
            data[i][0] =  scanner.nextInt();
            data[i][1] =  scanner.nextInt();
        }

        if (num < 1){
            int foottime = foot(data[num][0],data[num][1],data[num+1][0]);

            int[] taxitime = taxi(data, num);

            int max = foottime;
            for(int j =0; j< taxitime.length; j++){
                if (taxitime[j]< max){
                    max = taxitime[j];
                }
            }
            System.out.println(max);
        }else {

            int foottime = foot(data[num][0], data[num][1], data[num + 1][0]);

            System.out.println(foottime);
        }

//        System.out.println(data[num][0]);
//        System.out.println(foottime);
    }

}
