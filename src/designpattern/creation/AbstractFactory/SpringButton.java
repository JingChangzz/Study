package designpattern.creation.AbstractFactory;

/**
 * Created by ZhangJing on 2017/3/8.
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示SpringButton");
    }
}
