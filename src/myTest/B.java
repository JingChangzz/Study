package myTest;

import java.io.File;
import java.io.FileReader;

/**
 * Created by ZhangJing on 2017/2/18.
 */
public class B
{
//    public static B t1 = new B();
//    public static B t2 = new B();
//    {
//        System.out.println("构造块");
//    }
//    static
//    {
//        System.out.println("静态块");
//    }
//    public static void main(String[] args)
//    {
//        B t = new B();
//    }
//
//
//    String str = new String("good");
//    long l = 123;
//   char[] ch = {'a','b','c'};
// //    char ch = 'q';
//    public static void main(String[] args) {
//        B ex = new B();
//        ex.change(ex.l, ex.ch);
//        System.out.print(ex.l +" and ");
//        System.out.print(ex.ch);//数组是引用传递，会改变值；
//
//        int i = 0;
//        i = i ++;
//        System.out.println(i);
//
//        String s = "abc";
//        s = "cdce";
//        System.out.println(s);
//    }
//
//    public void change(long l, char chx[]){
////        str= "test ok";
//        l = 111;
//        chx[0] = 'g';
//    }

    String str = new String("good");
    char[] ch = {'a','b','c'};

    int i = 123;

    private static int total = 10;
    public void call(){
        int total = 5;
        System.out.println(this.total);
    }
    File aFile;
    B(){
        MyOtherClass otherClass = new MyOtherClass();
    }

    public static void main(String[] args) {
        


//        B ex = new B();
//        ex.change(ex.str, ex.ch,ex.i, ex);
//        System.out.print(ex.str +" and " );
//        System.out.print(ex.ch);
//        System.out.print(" and "+ex.i);
//
//         Integer first = new Integer(3);
//        Integer second = 3;
//        int three = 3;
//        System.out.println(first==second);
//        System.out.println(first==three);
//
//        int i=128;
//        Integer j = new Integer(128);
//        System.out.println(i==j);
//        System.out.println(j.equals(i));

    }

    public void change(String str, char chx[], int i,B b){
        str= "test ok";
        chx[0] = 'g';
        i = 111;
        b = new B();
        b.i = 100;
    }

}

class  MyException {
    private  static final long serialVersionUID =1L;
    public MyException(String m){

    }
    public String getMessage(){
        return "";
    }
}

class Policy{
    String name,type;
    public Policy(String name,String type){
        this.name = name;
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
}


class MyOtherClass{
    FileReader aReader;
    MyOtherClass(){}
}