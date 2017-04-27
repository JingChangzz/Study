package designpattern.behavior.strategy;

/**
 * Created by ZhangJing on 2017/4/24.
 */
public class Client {

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originPrice = 60.0;
        double currentPrice;

        movieTicket.setPrice(originPrice);
        System.out.println("原始票价：" + originPrice);
        System.out.println("-----------------------");

        Discount discount = new StudentDiscount();
        movieTicket.setDiscount(discount);

        currentPrice = movieTicket.getPrice();
        System.out.println("折后价：" + currentPrice);


    }
}
