package jianzhi_offer;

/**
 * Created by ZhangJing on 2017/4/1.
 *
 * 求最小的K个数
 *
 */
public class SmallestKNum {

    /**
     * 方法一：时间复杂度O(n)
     * 快排的一趟结束后，左边小于基准
     * 右边大于基准
     *
     * 这里的变形就是，经过快排后，基准的位置变到了 k-1
     * 那么左边得到的就是最小的k个数
     */

    public static int partition(int[] arr, int left, int right){

        int result = arr[left];

        if (left > right)
            return -1;

        while (left < right){
            while(left < right && arr[right] >= result){
                right--;
            }
            arr[left++] = arr[right];

            while (left < result && arr[left] < result){
                left++;
            }
            arr[right--] = arr[left];

        }

        arr[left] = result;

        return left;
    }

    public  static  int[] getLastKNum(int[] input, int k){

        if(input.length == 0 || k<=0){
            return null;
        }

        int[] result = new int[k];//保存结果

        int start =0;
        int end = input.length-1;

        int index = partition(input,start, end);

        while(index != k-1){
            if (index > k-1){
                end = index - 1;
                index = partition(input, start, end);
            }else{
                start = index + 1;
                index = partition(input, start, end);
            }

        }

        for (int i = 0; i < k; i++){
            result[i] = input[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        int k = 5;
        int[] result = getLastKNum(arr, k);

        for (int i = 0; i < k; i++){
            System.out.println(result[i] + ",");
        }
    }

}
