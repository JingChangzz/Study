package designpattern.creation.singleton;

/**
 * Created by ZhangJing on 2017/3/8.
 *
 * 饿汉模式
 *
 * 在定义静态变量的时候实例化单例类，
 * 因此在类加载的时候就已经 创建了单例对象
 *
 */
public class EagerSingleton {

    private static final EagerSingleton insstance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInsstance(){

        return insstance;
    }
}
