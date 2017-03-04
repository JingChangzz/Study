package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/3/2.
 */
public class RemoveDuplicateOverTwo {
    public static int removeDuplicates(int[] A) {
        if (A.length == 0 ){
            return 0;
        }
        int i = 1, j = 0;
        int num = 1;
        for(; i<A.length; i++){
            if (A[i] != A[j]){
                j++;
                A[j] = A[i];
            }

        }
        System.out.println(A);
        return j+1;
    }

    public static void main(String[] args){
        int[] B = new int[]{};
        int[] A = new int[]{1,2,2,3,4,5,6,6};

        System.out.println(removeDuplicates(A));
    }
}
