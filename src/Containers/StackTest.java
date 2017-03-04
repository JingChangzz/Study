package Containers;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void iteratorThroughRandomAccess(List list){
		String val = null;
		for(int i=0; i<list.size(); i++){
			val = list.get(i).toString();
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static void iteratorThroughIterator(List list) {
		String val = null;
		for(Iterator iter = list.iterator(); iter.hasNext();){
			val = iter.next().toString();
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		//入栈
		for(int i=1; i<6; i++){
			stack.push(i);
		}
			
		//遍历
		iteratorThroughRandomAccess(stack);
		iteratorThroughIterator(stack);
		
		//search,5在栈顶，所以输出1
		int pos = stack.search(5);
		System.out.println("position of 5: "+pos);
		
		//pop,弹出栈顶
		stack.pop();
		iteratorThroughRandomAccess(stack);
		
		//peek
		String val = stack.peek().toString();
		System.out.println("peek(): "+val);
		
	}
}
