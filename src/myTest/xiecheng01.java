package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/11.
 */
public class xiecheng01 {

    public static void maxMulti(int input){
        if (input > 50){
            return;
        }

        if(input == 1 || input==2){
            System.out.println(input);
        }else if (input == 3 || input==4){
            System.out.println(input-1);

        }else{
            int num =0;
            int answer=1;
            int[] result = new int[input+1];
            int rest=0,a=0,m=0;

            for (int j = 2; j <= input;j++ ) result[j]=1;

            for (int i =2; i <= input; i++){
                num = i + num;

                if(num > input){
                  rest = input - num + i;

                    if (rest < (i-2)){
                        a=1;
                        m=0;
                    }else{
                        a = rest/(i-2);
                        m = rest%(i-2);
                    }

                    for (int j = i-1; j >= i-rest;j--){
                        result[j] = a + result[j];
                    }

                    result[i-1] = m + result[i-1];
                    break;
                }
                result[i]=i;

            }

            for (int i =2;i<=input;i++){
                answer = answer*result[i];
            }
            System.out.println(answer);
        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        maxMulti(input);

    }
}
