package designpattern.creation.singleton;

/**
 * Created by ZhangJing on 2017/3/8.
 *
 *
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存;
 * 懒汉式单例类线程安全控 制烦琐，而且性能受影响。
 *
 * Initialization Demand Holder (IoDH)的技术
 * 能够将两种单例的缺点都克服
 *
 * 静态单例对象没有作为Singleton的成员变量直接实例化，
 * 因此类加载时不会实例化Singleton
 *
 * 第一次调用getInstance()时将加载内部类HolderClass，
 * 在该内部类中定义了一个static类型的变量 instance，
 * 此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，
 * 确保该成员 变量只能初始化一次。
 *
 */
public class SuperSingleton {

    private SuperSingleton(){}

    //静态内部类
    private static class HolderClass{
        private final static SuperSingleton instance = new SuperSingleton();
    }

    public static SuperSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        SuperSingleton s1, s2;
        s1 = SuperSingleton.getInstance();
        s2 = SuperSingleton.getInstance();

        System.out.println(s1 == s2);
    }

}
