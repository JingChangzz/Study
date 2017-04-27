package myTest;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/18.
 */
public class toutiao01 {

    public static void equalNum(ArrayList m, ArrayList n){

        for (int j = 0; j< n.size();j++){
            if (m.contains(n.get(j))){
                System.out.println(n.get(j)+"  ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ma = new ArrayList<>();
        ArrayList<Integer> na = new ArrayList<>();

        int m = scanner.nextInt();
        for (int i =0;i<m;i++){
            ma.add(scanner.nextInt());
        }

        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
//            na.add(scanner.nextInt());
            int temp= scanner.nextInt();
            if (ma.contains(temp)){
                System.out.println(temp+"  ");
            }


        }

 //       equalNum(ma,na);
    }
}
