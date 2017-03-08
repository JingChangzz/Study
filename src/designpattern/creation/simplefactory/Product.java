package designpattern.creation.simplefactory;

/**
 * Created by ZhangJing on 2017/3/7.
 */
abstract class Product {

    public static void methodSame() {
        //product的公共方法
        System.out.println("所有produ的公共方法，被具体product继承");
    }

    public abstract void methodDiff();
        //product的各自不同的方法
}
