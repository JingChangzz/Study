package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/8/10.
 */
public class ali18 {


/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int maxScore(int[] score) {
        int result = 0;
        if(score.length == 0){
            result = 0;
        } else if (score.length == 1){
            if (score[0] == 0){
                return 0;
            }
            return score[0];
        } else if (score.length == 2) {

        } else {
            for (int i = 0; i < score.length; i++){
                if (i == 0 ){
                    if (score[i+1] != 0)
                        result = result + score[i]*score[i+1];
                    else result = result + score[i];
                    score[i] = 0;
                } else if (i==score.length-1){
                    if (score[i-1] != 0)
                        result = result + score[i-1]*score[i];
                    else
                        result = result + score[i];
                    score[i] = 0;
                } else{
                    if (score[i-1] != 0){

                    }else if (score[i+1] != 0){

                    }

                    result = result + score[i-1]*score[i]*score[i+1];
                    score[i] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _score_size = 0;
        _score_size = Integer.parseInt(in.nextLine().trim());
        int[] _score = new int[_score_size];
        int _score_item;
        for(int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine().trim());
            _score[_score_i] = _score_item;
        }

        res = maxScore(_score);
        System.out.println(String.valueOf(res));

    }

}
