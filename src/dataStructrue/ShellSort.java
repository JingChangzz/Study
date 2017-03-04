package dataStructrue;

public class ShellSort {
	private long[] theArray;
	private int nElems;
	
	public ShellSort(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	private void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	
	public void display() {
		System.out.println("A=");
		for (int i = 0; i < nElems; i++) {
			System.out.println(theArray[i] + "	");
		}
		System.out.println("");
	}
	
	public void shellsort() {
		int inner, outer;
		long temp;
		
		int h = 1;
		while(h <= nElems/3){
			h = h*3 + 1;
		}
		
		while(h > 0){
			for (outer = 0; outer < nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
			
				while(inner > h-1 && theArray[inner-h] >= temp){
					theArray[inner] = theArray[inner-h];
					inner = h;
				}
				theArray[inner] = temp;
			}
			h = (h-1)*3;
		}
	}
	
	public static void main(String[] args) {
		int maxSize = 10;
		ShellSort shellSort = new ShellSort(maxSize);
	}
}
