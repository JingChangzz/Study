package designpattern.behavior.strategy;

/**
 * Created by ZhangJing on 2017/4/24.
 */
public class VIPDiscount implements Discount {


    @Override
    public double calculate(double price) {
        System.out.println("VIP：");
        return price*0.5;
    }
}
