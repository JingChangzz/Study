package dataStructrue.find;

/**
 * Created by ZhangJing on 2017/5/6.
 *
 * 折半查找的前提条件是在一个有序的序列中。
 * 首先确定待查记录所在的区间，
 * 然后逐步的缩小范围区间直到找到或者找不到该记录为止。
 * 与数学中的二分法一样。
 *
 * 使用二分查找的话可以减少时间复杂度为：O（logn）
 *
 */
public class BinarySearch {

    public static boolean binarySearch(int[] table ,int keyWord){
        int low = 0;
        int height = table.length-1;
        int mid;
        while(low<=height){
            mid = (low+height)/2;
            if(table[mid]> keyWord){
                height = mid-1;
            }else if(table[mid]<keyWord){
                low = mid+1;
            }else if(table[mid] == keyWord){
                return true;
            }
        }
        return false;
    }

    //二分查找，递归版本
   public static int BinarySearch2(int a[], int value, int low, int high)
    {
        int mid = low+(high-low)/2;
        if(a[mid]==value)
            return mid;
        if(a[mid]>value)
            return BinarySearch2(a, value, low, mid-1);
        if(a[mid]<value)
            return BinarySearch2(a, value, mid+1, high);
        return mid;
    }

    /**
     *二分查找特定整数在整型数组中的位置(递归)
     *@paramdataset
     *@paramdata
     *@parambeginIndex
     *@paramendIndex
     *@returnindex
     */
    public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;
        if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
            return -1;
        }
        if(data <dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
        }else if(data>dataset[midIndex]){
            return binarySearch(dataset,data,midIndex+1,endIndex);
        }else {
            return midIndex;
        }
    }


    public static void main(String[] args) {
        int[] table = {2,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.binarySearch(table, 20));

    }
}
