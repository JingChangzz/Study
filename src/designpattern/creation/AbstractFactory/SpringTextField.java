package designpattern.creation.AbstractFactory;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示SpringTextField");
    }
}
