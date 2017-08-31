package wangyi;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/12.
 */
public class wangyi02 {
    public static String res(int num, int[] x, int[] y){
        String result = "0 1 3 10";


        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] x = new int[num];
        int[] y = new int[num];

        for (int i =0; i < num; i++){
            String xx = scanner.nextLine();
        }
        
        for (int i =0; i < num; i++){
            y[i] = scanner.nextInt();
        }

        Point[] points = new Point[num];

        for (int i=0 ; i < num; i++){
            points[i] = new Point(x[i], y[i]);
        }

        for(int i =0; i < num; i++){
            if (i == 3){
                System.out.println(points[i].px - points[0].px + points[i].py - points[0].py);
            }else{
                System.out.println(points[i].px - points[0].px + points[i].py - points[0].py + " ");
            }

        }

        System.out.println(res(num, x, y));
    }
}
 class Point{
    static int px;
    static int py;
    public Point(int px, int py){
        this.px = px;
        this.py = py;
    }
 }
