package myTest;

import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/27.
 */
public class baidu01 {

    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }
    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void findMin3(int N, int[] prices){
        if (N < 3){
            System.out.println(-1);
            return;
        }

        quickSort(prices);

        int result = prices[0];
        int k=1;
        int i = 1;
        for (;i < N && k<3; i++) {

           if (result < prices[i]){
               result = prices[i];
               k++;
           }
        }
        if (i== N && k < 3){
            System.out.println(-1);
            return;
        }
        System.out.println(prices[i-1]);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
           prices[i] = scanner.nextInt();
        }

        findMin3(N,prices);

    }
}
