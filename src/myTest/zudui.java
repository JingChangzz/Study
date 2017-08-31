package myTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/5/19.
 *
 * 3个一队，第二个数为每队的水平
 * 求队最大的水平。
 *
 *
 * 其实就是找到最大的num+个数。
 *
 */
public class zudui {
    public static List<List<Integer>> cal(List<Integer> a) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int size = a.size();
        List<Integer> temp = null;
        if (size == 2) {
            temp = new ArrayList<Integer>(2);
            temp.add(a.get(0));
            temp.add(a.get(1));
            res.add(temp);

            temp = new ArrayList<Integer>(2);
            temp.add(a.get(1));
            temp.add(a.get(0));
            res.add(temp);
        } else if (size > 2) {
            List<List<Integer>> tempRes = null;
            Integer firstNum = null;
            List<Integer> tempPar = null;
            for (int i = 0; i < size; i++) {
                firstNum = a.get(i);
                tempPar = new ArrayList<Integer>(a);
                tempPar.remove(i);
                tempRes = cal(tempPar);
                if (tempRes != null && tempRes.size() > 0) {
                    for (List<Integer> intList : tempRes) {
                        intList.add(0, firstNum);
                        res.add(intList);
                    }
                }

            }
        }

        return res;
    }

    public static int secondMax(int input1, int input2, int input3){
        int result = input2;
        if (input1 <= input2 && input2 <= input3){
            result = input2;
        }else if (input2 <= input1 && input1 <= input3){
            result = input1;
        }else if (input2 <= input3 && input3 <= input1){
            result = input3;
        }else if (input3 <= input2 && input2 <= input1){
            result = input2;
        }else if (input3 <= input1 && input1 <= input2){
            result = input1;
        }else if (input1 <= input3 && input3 <= input2){
            result = input3;
        }
        return result;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> a = new ArrayList<>(3*num);
        for (int i = 0; i < 3*num; i++) {
            a.add(scanner.nextInt());
        }

        List<List<Integer>> resList = cal(a);
        int max = 0;

        int f = 0;
        for (List<Integer> intList : resList) {
            int temp = 0;
            for (int i = 0; i < num; i++) {
                temp = temp + secondMax(intList.get(3*i), intList.get(3*i+1),intList.get(3*i+2));
            }
           // System.out.println("-"+temp+"-");
            if (f ==0){
                max = temp;
                f++;
            }else if (max < temp){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
