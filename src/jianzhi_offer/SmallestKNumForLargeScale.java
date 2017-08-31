package jianzhi_offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/4/1.
 *
 * 适用于海量数据！
 *
 * 堆
 *
 */
public class SmallestKNumForLargeScale {

    public static void buildMaxHeap(int[] arr, int lastIndex){

        for (int i = (lastIndex -1)/2; i >= 0; i--){
            int k = i;

            while(2*k+1 <= lastIndex){
                int biggerIndex = 2*k + 1;
                if (biggerIndex < lastIndex){
                    if (arr[biggerIndex] < arr[biggerIndex + 1]){
                        biggerIndex++;
                    }
                }

                if (arr[k] < arr[biggerIndex]){
                    swap(arr, k, biggerIndex);
                    k = biggerIndex;
                }else
                    break;
            }
        }

    }

    private static void swap(int[] arr, int k, int biggerIndex) {
        int temp = arr[k];
        arr[k] = arr[biggerIndex];
        arr[biggerIndex] = temp;
    }

    public static void heapSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            buildMaxHeap(arr, arr.length-i-1);
            swap(arr, 0, arr.length-i-1);
        }
    }

    public static void getLastNum(int[] arr, int k){
        if (arr == null || k == 0 || k > arr.length){
            return;
        }

        /**
         * 直接取k个数，排序成最大堆（根节点最大）
         *
         * 从第k+1个数，与最大堆的根节点比较，比节点小，
         * 插进堆中（需要对堆进行重建）
         *
         */
        int[] kResult = Arrays.copyOfRange(arr, 0, k);
        heapSort(kResult);

        for (int i = k; i < arr.length-1; i++){
            if (arr[i] < kResult[k-1]){
                kResult[k-1] = arr[i];
                heapSort(kResult);
            }
        }

        for (int i : kResult){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {4,5,1,6,2,7,3,8};
//        int k = 5;
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        int k = scanner.nextInt();
        String[] ins = in.split(" ");

        int[] input = new int[ins.length];
        for(int i=0;i<ins.length;i++){
            input[i]=Integer.parseInt(ins[i]);
        }

        getLastNum(input, k);

    }
}
