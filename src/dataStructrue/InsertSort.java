package dataStructrue;

/**
 * 插入排序
 *
 * 时间复杂度O(n*n)
 * 
 *
 */

public class InsertSort {

	private long[] a;
	private int nElems;
	
	public InsertSort(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	//插入
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	//显示
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	//交换
	public void swap(int one, int otherone) {
		long temp = a[one];
		a[one] = a[otherone];
		a[otherone] = temp;
	}
	//排序
	public void iSort() {
		for (int i = 1; i < nElems; i++) {
			long temp = a[i];
			int j = i;
			while(j>0 && a[j-1]>=temp){
				a[j] = a[j-1];
				--j;
			}
			a[j] = temp;
			display();
		}
	}
	
	public void sort(){
		System.out.println(nElems);
		for (int i = 0; i < nElems-1; i++){
			int j = i+1;
			while(j>0 && a[j] < a[j-1]){
				swap(j,j-1);
				j--;
			}
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 10;
		InsertSort iSort = new InsertSort(maxSize);
		
		iSort.insert(17);
		iSort.insert(7);
		iSort.insert(3);
		iSort.insert(10);
		iSort.insert(27);
		iSort.insert(1);
		
		iSort.display();
		iSort.sort();
		iSort.display();
	}

}
