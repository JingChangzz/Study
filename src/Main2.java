import java.util.Arrays;
import java.util.Random;

public class Main2 {

    private static void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }

    public static int partition(int[] nums,int start,int end){
        int index=new Random().nextInt(nums.length);
        int num=nums[index];
        swap(nums, index, 0);
        int i=start;
        int j=end;
        while(i<j){
            while(i<j&&nums[j]<=num){
                j--;
            }
            if(i<j){
                nums[i++]=nums[j];
            }
            while(i<j&&nums[i]>num){
                i++;
            }
            if(i<j){
                nums[j--]=nums[i];
            }
        }
        nums[i]=num;
        return i;
    }

    public static int partition(int[] nums){
        return partition(nums, 0, nums.length-1);

    }

    public static int[] findKmax(int[] nums,int k,int start,int end){
        int index=partition(nums,start,end);
        int length=index-start+1;
        int[] tempMax= Arrays.copyOf(nums, length);
        int[] tempMin=new int[nums.length-length];
        System.arraycopy(nums, index+1, tempMin, 0, nums.length-length);
        if(length>k){
            return findKmax(tempMax,k,0,tempMax.length-1);
        }else if(length==k){
            return tempMax;
        }else{
            int[] temp2=new int[k];
            System.arraycopy(tempMax, 0, temp2, 0, tempMax.length);
            int[] temp3=findKmax(tempMin,k-length,0,tempMin.length-1);
            System.arraycopy(temp3,0, temp2, index+1, temp3.length);
            return temp2;
        }
    }

    public static int[] findKmax(int[] nums,int k){
        return findKmax(nums, k, 0, nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums={1,5,8,9,11,2,3};

        int[] result=findKmax(nums, 3);
        System.out.println(result[result.length-1]);
    }

}  