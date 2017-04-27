package myTest;

import java.util.*;

/**
 * Created by ZhangJing on 2017/4/22.
 */
public class didi02 {

    public static void getNum(Map<Integer, Integer> map){

        for (int i = 0; i < map.size(); i++) {



        }

    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<Integer, Integer> map = new TreeMap<>();



            int sunNum = scanner.nextInt();
            int[] in = new int[sunNum];
            for (int i = 0; i < sunNum; i++) {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                map.put(key,value );

            }

            if (sunNum == 0) {
                System.out.println(0);
            } else if (sunNum == 1) {
                System.out.println(1);
            } else {
                getNum(map);
            }

        }
    }