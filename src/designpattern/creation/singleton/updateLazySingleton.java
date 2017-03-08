package designpattern.creation.singleton;

/**
 * Created by ZhangJing on 2017/3/8.
 *
 * 创冲判断的饱汉线程安全模式
 *
 * 解决线程安全问题又不影响系统性能
 *
 * 假如在某一瞬间线程A和线程B都在调用getInstance()方法，
 * 此时instance对象为null值，均能通过instance == null的判断。
 * 由于实现了synchronized加锁机制，
 * 线程A进入synchronized锁定的代码中执行实例创建代码，
 * 线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
 * 但当A执行完毕时，线程B并不知道实例已经创建，
 * 将继续创建新的实例，导致产生多个单例对象
 *
 * 所以，
 * 在synchronized中再进行一次(instance == null)判断，
 * 这种方式称为双重检查锁定(Double-Check Locking)。
 *
 */
public class updateLazySingleton {

    private volatile static updateLazySingleton instance = null;

    private updateLazySingleton(){}

    public static updateLazySingleton getInstance() {

        if (instance == null){
            synchronized (updateLazySingleton.class){
                if (instance == null){
                    instance = new updateLazySingleton();
                }
            }
        }

        return instance;
    }
}
