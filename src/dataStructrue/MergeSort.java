package dataStructrue;

public class MergeSort {

	public static void merge(int[] A, int sixeA, int[] B, int sizeB, int[] C){
		int aDex = 0, bDex = 0, cDex = 0;
		while(aDex < sixeA && bDex < sizeB){
			if(A[aDex] < B[bDex]){
				C[cDex++] = A[aDex++];
			}else{
				C[cDex++] = B[bDex++];
			}
		}
		while(aDex < sixeA){
			C[cDex++] = A[aDex++];
		}
		while (bDex < sizeB) {
			C[cDex++] = B[bDex++];
		}
	}
	
	//显示
	public static void display(int[] a, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {23,47,81,95};
		int[] arrayB = {7,14,39,55,62,74};
		int[] arrayC = new int[10];
		
		merge(arrayA, 4, arrayB, 6, arrayC);
		display(arrayC, 10);
	}

}
