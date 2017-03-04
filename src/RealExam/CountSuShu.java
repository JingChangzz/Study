package RealExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/3.
 */
public class CountSuShu {

    public static void count(int[] range){
        int numOfSu = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= 10000; i++){
            int num = 1;
            if(i%2 ==0 && i != 2){
                continue;
            }
            for (int k = 2; k < i; k++){
                if(i%k == 0){
                    num++;
                }
            }
            if(num == 1 ){
                numOfSu++;
                if (numOfSu > range[0] && result.size() < range[1]-range[0]+1){
                    result.add(i);
                }

            }

            if(result.size() > range[1]-range[0]+1){
                break;
            }
            num = 1;
        }

        for(int j = 0; j< result.size(); j++){

            if( (j+1)%10 == 1) {
                System.out.print(result.get(j));
            }else{
                System.out.print("  "+result.get(j));
            }
            if ((j+1)%10 == 0) System.out.println();
        }
    }

    public static void main(String[] args){
        int[] range = new int[2];
        Scanner scanner = new Scanner(System.in);
        range[0] = scanner.nextInt();
        range[1] = scanner.nextInt();
        if (range[0] > range[1]){
            System.out.print("输入有误");
        }

        count(range);
    }
}
