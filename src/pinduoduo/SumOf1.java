package pinduoduo;

import java.util.*;

/**
 * Created by ZhangJing on 2017/8/27.
 */
public class SumOf1 {

    private static void numOf1(int[][] input){

        int max = 0;
        List<Integer> result = new ArrayList<>();
        for (int row = 0; row < input.length; row++) {
            String r = "";
            for (int x: input[row]) {
                r = r+ String.valueOf(x);
            }

            String[] ans = r.split("01");
            result.add(ans[1].length()+1);
            if (ans[1].length()+1 >= max) {
                max = ans[1].length()+1;

            }
        }

        for(int i = 0; i < result.size(); i++) {
           if (result.get(i) == max) {
               System.out.println(i + "," + max);
           }
        }
    }


    public static void main(String[] args) {
        int[][] input = {{0,0,0,0,0,0,0,1,1,1,1,1},
                         {0,0,0,0,1,1,1,1,1,1,1,1},
                         {0,0,0,0,0,0,1,1,1,1,1,1},
                         {0,0,0,0,0,0,0,0,0,1,1,1},
                         {0,0,0,0,0,0,0,1,1,1,1,1},
                         {0,0,0,0,1,1,1,1,1,1,1,1}};

        numOf1(input);
    }
}
