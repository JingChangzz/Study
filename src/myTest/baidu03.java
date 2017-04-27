package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/27.
 */
public class baidu03 {

    static int result=0;

    static boolean fullSort(int arr[], int n, int kn) {
        int i = 0, j = 0, k = -1, l, temp;

        for (i = 0; i < n - 1; i++) { // 找最后的升序的位置
            if (arr[i] < arr[i + 1])
                k = i;
        }

        if (k >= 0) {
            l = -1;

            for (i = 0; i < n; i++) { // 找到最后一个升序且是最大的数的下标
                if (arr[k] < arr[i])
                    l = i;
            }

            temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;

            for (i = k + 1; i < n; i++)// 将k+1的元素与末尾对调
            {
                j = n - i + k;
                if (i >= j)
                    break;

                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (k == -1)
            return false;
        int t = arr[0];
        for (i = 1; i < n; i++){
            if (t < arr[i] && kn>0){
                t = arr[i];
                kn--;
            }else{
                break;
            }
            result++;
        }
//            System.out.print(arr[i]);

        return true;
    }


    public static void findNum(int n, int k){
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = i;
        }
        while(fullSort(value, n,k));
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if (k>=n){
            System.out.println(0);
        }else if (k==1&&n==2){
            System.out.println(1);
        }else
            findNum(n,k);

        System.out.println(result);

    }

}
