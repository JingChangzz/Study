package designpattern.creation.simplefactory;

/**
 * Created by ZhangJing on 2017/3/7.
 */
public class Client {

    public static void main(String[] args) {

        Product product;
        product = Factory.getProduct("A");
        product.methodDiff();
        product.methodSame();
    }
}
