package jvm;

/**
 * Created by ZhangJing on 2017/3/14.
 *
 * 被动引用：不触发初始化
 *
 * 对于静态字段，只有直接定义这个字段的类才会被初始化
 * 通过子类引用父类中定义的静态字段，只会触发父类的初始化
 *
 *
 * 结果：
 * SuperClass init!
 * 123
 * 【假如SuperClass中，将123定义为static final ,那么只会输出
 *    123，因为在便一阶段通过常量传播优化，已经将这个值存储到了常量池中，
 *    以后对该值得引用，都被转化为对常量池的引用】
 *
 *
 * */


public class BeenReffered {

    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer(10);
        s1.append("1234");
        System.out.println(s1.length());
        System.out.println(s1.capacity());

        short a =128;
        byte b =(byte) a;
        System.out.println(a+","+b);


        System.out.println(SubClass.value);
    }

}
