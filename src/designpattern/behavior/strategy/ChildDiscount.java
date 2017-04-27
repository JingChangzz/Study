package designpattern.behavior.strategy;

/**
 * Created by ZhangJing on 2017/4/24.
 */
public class ChildDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }

}
