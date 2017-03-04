package myTest;

import java.util.Scanner;

public class Cal {

    public static String calABC(int i, long[] datas){

            if(datas[0]+datas[1] > datas[2]){
                return "Case #"+ Integer.toString(i+1) +": "+true;
            }else{
                return "Case #"+ Integer.toString(i+1) +": "+false;
            }

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        long[] data = new long[3];
        String[] result = new String[count];

        for(int i =0; i < count; i++){
            for(int j =0; j < 3; j++){
                data[j] = s.nextLong();
            }
            result[i] = calABC(i, data);
        }

        for (String r: result) {
            System.out.println(r);
        }
    }

}
