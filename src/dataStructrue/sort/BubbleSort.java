package dataStructrue.sort;

/**
 * 插入排序
 * O(n*n)
 * @author ZhangJing
 *
 */

public class BubbleSort {

	private long[] a;
	private int nElems;
	
	public BubbleSort(int max) {
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
	
	public static void main(String[] args) {
		int maxSize = 10;
		BubbleSort bubbleSort = new BubbleSort(maxSize);
		
		bubbleSort.insert(17);
		bubbleSort.insert(7);
		bubbleSort.insert(3);
		bubbleSort.insert(1);
		
		bubbleSort.display();
		
		for (int i = bubbleSort.nElems-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(bubbleSort.a[j] > bubbleSort.a[j+1]){
					bubbleSort.swap(j, j+1);
				}
			}
			bubbleSort.display();
		}

	}
}
