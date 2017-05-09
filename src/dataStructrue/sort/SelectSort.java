package dataStructrue.sort;

public class SelectSort {

	private long[] a;
	private int nElems;
	
	public SelectSort(int max) {
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
	public void sSort() {
		int min;
		for (int i = 0; i < nElems-1; i++) {
			min = i;
			for (int j = i+1; j < nElems; j++) {
				if(a[j]<a[min]){
					min = j;
				}
			}
			display();
			swap(i, min);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 10;
		SelectSort sSort = new SelectSort(maxSize);
		
		sSort.insert(17);
		sSort.insert(7);
		sSort.insert(3);
		sSort.insert(27);
		sSort.insert(1);
		
		sSort.display();
		sSort.sSort();
		sSort.display();
		
	}

}
