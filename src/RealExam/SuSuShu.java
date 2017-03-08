package RealExam;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/7.
 *
 * 超级素数幂：m = p^q,p是素数
 */
public class SuSuShu {

    public static  void dipose(double in){

        if (in < 2 || in > Math.pow(10,18)){
            System.out.println("No");
            return;
        }

        for(int i = 2; i< in; i++){

            double shang = Math.pow(in, 1.0/i);

            if(Math.abs(shang-Math.round(shang)) <= 0.000000001) {

                if (isSushu(shang)) {
                    System.out.println((int)shang + " " + i);
                    return;
                }
            }

        }
        System.out.println("No");
    }

    public static boolean isSushu(double a){
        boolean flag = true;

        if (a < 2) {// 素数不小于2
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false

                    flag = false;
                    break;// 跳出循环
                }
            }
        }
 //       System.out.println(flag);
        return flag;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();
        dipose(in);
     //   isSushu(3);


    }

}
