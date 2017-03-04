package train_in_leetcode;

import java.util.HashMap;

/**
 * Created by ZhangJing on 2017/2/27.
 */
public class MaxNumInLine {

        public static int maxPoints(Point[] points) {
            int result = 0;
            int numOfPoints = points.length;


            if (numOfPoints <= 2) {//only 2 points
                result = numOfPoints;
            } else {

                for (int i =0; i < numOfPoints; i++){
                    HashMap<Float, Integer> lines = new HashMap<>();
                    int col = 0;
                    int row = 0;
                    int same = 1;
                    int max = 0;

                    for (int j=0; j < numOfPoints; j++){
                        if (i == j) continue;

                        if(points[i].x == points[j].x && points[i].y == points[j].y){ //重合
                            same++;
                            continue;
                        }
                        if (points[i].x == points[j].x){ // x坐标相同，垂直
                            col++;
                        }else if (points[i].y == points[j].y){ //y坐标相同，水平
                            row++;
                        }else{
                            float k = (float)(points[i].y - points[j].y)/(points[i].x - points[j].x);
                            if (lines.get(k) != null){
                                lines.put(k, lines.get(k)+1);
                            }else{
                                lines.put(k, 1);
                            }
                        }
                    }
                    max =Math.max(max,Math.max(col, row)) ;
                    for (float k: lines.keySet()) {
                        max = Math.max(max, lines.get(k));
                    }
                    result =Math.max( max+same, result);
                }

            }

            return result;
        }

        public static void main(String[] args){

            Point[] p = new Point[4];
            p[0] = new Point(1,1);
            p[1] = new Point(1,1);
            p[2] = new Point(1,1);
            p[3] = new Point(1,1);

            System.out.print(maxPoints(p));

        }


}


class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}