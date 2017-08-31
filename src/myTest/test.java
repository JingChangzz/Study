package myTest;

import java.util.HashMap;

class C {
    C() {
        System.out.print("C");
    }
}
 
class A {
    C c = new C();
 
    A() {
        this("A");
        System.out.print("A");
    }
 
    A(String s) {
        System.out.print(s);
    }
}
 
class test extends A {
    test() {
        super("B");
        System.out.print("B");
    }



    public static void main(String[] args) {
       // new test();

        HashMap<Integer, User> hs = new HashMap<>();
        User temp = new User();
        for(int i=0 ; i< 10 ; i++) {
            temp.id = i;
            temp.name = String.valueOf(i);

            hs.put(i, temp);
        }

        for (int i =1; i < hs.size(); i++) {
            System.out.println(hs.get(i).name + "//**");
        }

    	String _str1="hello";
    	String str2="he"+ new String("llo"); //用+拼接字符串时，会创建一个新对象再返回。
    	String str3 = "he" + "lo";
    	System.out.println(_str1==str2);
    	System.out.println(_str1==str3);
    	
    	
    	/**
    	 * Byte,Short,Integer,Long,Character这5种整型的包装类
    	 * 只是在对应值小于等于127并且大于等于-128时才可使用常量池，
    	 * 因为他们至占用一个字节(-128~127);
    	 */
    	Integer i01=59;
    	int i02=59;
    	Integer i03=Integer.valueOf(59);
    	Integer i04=new Integer(59);
    	
    	  System.out.println(i01==i02);
    	  System.out.println(i01==i03);//59在-128~127范围之内，所以在自动装箱的时候，会返回IntegerCache[59 - (-128)];
    	  System.out.println(i03==i04);
    	  System.out.println(i02==i04);
    	  
    	  int countx = 0, x = 65530;//x的二进制有多少个1
    	  while(x!=0){
    		  countx++;
    			  x = x & (x-1);
    	  }
    	  System.out.println(countx);
    	  
          int i = 0; 
          i= i ++; 
          System.out.println(i);
          
          String xx="fmn";
          xx.toUpperCase();
          System.out.println(xx);
          String y=xx.replace('f','F');
          y=y+"wxy";
          System.out.println(y);
    }
}

class User{
    public int id;
    public String name;
}