package Containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * java容器之List---ArrayList
 * 
 * ①多个线程修改，需要Collections.synchronizedList()
 * ②用数组实现的List。能进行快速的随机访问，但是往列表中间插入和删除元素的时候比较慢。
 * 
 * @author ZhangJing
 *
 */

public class Listarray{
	
	//3种遍历方法
	public static void iteratorThroughRandomAccess(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i=0; i<list.size(); i++) {
             list.get(i);
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughRandomAccess：" + interval+" ms");
     }
	//最快
     public static void iteratorThroughIterator(List list) { 
         long startTime;
         long endTime;
         startTime = System.currentTimeMillis();
         for(Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
         }
         endTime = System.currentTimeMillis();
         long interval = endTime - startTime;
         System.out.println("iteratorThroughIterator：" + interval+" ms");
     }
 
     public static void iteratorThroughFor2(List list) {
         long startTime;
         long endTime;
         startTime = System.currentTimeMillis();
         for(Object obj:list)
             ;
         endTime = System.currentTimeMillis();
         long interval = endTime - startTime;
         System.out.println("iteratorThroughFor2：" + interval+" ms");
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List list = new ArrayList();  //ArrayList<Integer> list=new ArrayList();
		 for (int i=0; i<10; i++){
			 list.add(i);
		 }
		 //只有在数据量很大时，遍历时间才有差别
		 iteratorThroughFor2(list);
		 iteratorThroughIterator(list);
		 iteratorThroughRandomAccess(list);
		 
		 System.out.println(list);
		 System.out.println(list.add("x"));//可以添加相同值
		 System.out.println(list);
		 System.out.println(list.remove(10));//10->index
		 System.out.println(list);
		 list.add(null);//可以添加null
		 System.out.println(list);
		 //倒序遍历
		 ListIterator<Integer> lt=list.listIterator(list.size());
		 while(lt.hasPrevious())
		    System.out.println(lt.previous());
	}

}
