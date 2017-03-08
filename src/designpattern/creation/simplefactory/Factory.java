package designpattern.creation.simplefactory;

/**
 * Created by ZhangJing on 2017/3/7.
 */
public class Factory {

    public static Product getProduct(String s) {
        Product product = null;

        if(s.equalsIgnoreCase("A")){
            product = new ProductA();
        }else if(s.equalsIgnoreCase("B")){
            product = new ProductB();
        }else{
            System.out.println("参数错误，无法创建相应对象");
        }
        return product;
    }


}
