package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/2/28.
 *
 * 得到数组删除全部指定元素后的长度
 *
 * 思路：将后面要保留元素往前移动
 */
public class RemoveedLength {

    public static int removeElement(int A[], int ele){
        int i = 0, j = 0;
        for(i = 0; i<A.length; i++){
            if(A[i] == ele){
                continue;
            }
            A[j] = A[i];
            j++;
        }
        return j;
    }

    public static void main(String[] args){
        int[] B = new int[]{};
        int[] A = new int[]{1,2,2,3,8,5,6,4,2};

        System.out.println(removeElement(A, 2));
    }
}
