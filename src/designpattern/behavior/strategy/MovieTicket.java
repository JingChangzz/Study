package designpattern.behavior.strategy;

/**
 * Created by ZhangJing on 2017/4/24.
 */
public class MovieTicket {

    private double price;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    private Discount discount;

    public double getPrice() {
        return discount.calculate(this.price);
    }

    public void setPrice(double price) {

        this.price = price;
    }



}
