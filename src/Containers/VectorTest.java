package Containers;

import java.util.Enumeration;
import java.util.Vector;

/**
 *  java容器之Vector
 *  ①矢量队列，和ArrayList一样，它也是一个动态数组，由数组实现。
 *  ②ArrayList是非线程安全的，而Vector是线程安全的。
 *  
 * @author ZhangJing
 *
 */
public class VectorTest {

	public static void main(String[] args) {
		//initial size is 3, increment is 2
		Vector v = new Vector(3,2);
		
		System.out.println("Initial Size:"+ v.size());
		System.out.println("Initial capacity:"+ v.capacity());

	    v.addElement(new Integer(1));
	    v.addElement(new Integer(2));
	    v.addElement(new Integer(3));
	    v.addElement(new Integer(4));
	    System.out.println("Capacity after four additions: " + v.capacity());
	    v.addElement(new Double(5.45));
	    System.out.println("Current capacity: " + v.capacity());
	    System.out.println(v);
	    Enumeration vEnum = v.elements();
	    System.out.println("\n遍历Elements in vector:");
	    while(vEnum.hasMoreElements())
	       System.out.print(vEnum.nextElement() + " ");
	    System.out.println();
	}
}
