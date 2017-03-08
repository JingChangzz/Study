package designpattern.creation.singleton;

/**
 * Created by ZhangJing on 2017/3/8.
 *
 * 懒汉模式（饱汉模式）
 *
 * 在第一次调用getInstance()方法时实例化，
 * 在类加载时并不自行实例化
 * 称为延迟加载(Lazy Load)技术
 * 即需要的时候再加载实例
 *
 * 为了避免多个线程同时调用getInstance()方法
 *
 * 缺点：每次调用getInstance()时都需要进行线程锁定判断，
 * 在多线程高并发访问环境中，将会导致系统性能大大降低
 */

public class LazySingleton {

    private static LazySingleton instance = new LazySingleton();

    private LazySingleton(){}

    synchronized public static LazySingleton getInstance(){

        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
