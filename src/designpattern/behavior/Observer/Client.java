package designpattern.behavior.Observer;

/**
 * Created by ZhangJing on 2017/4/11.
 */
public class Client {


    public static void main(String[] args) {
        AllyControlCenter acc;
        acc = new ContreteAllyControlCenter("金庸群侠");

        Observer play01, play02, play03, play04;
        play01 = new Player("郭靖");
        acc.join(play01);


        play02 = new Player("洪七公");
        acc.join(play02);

        play03 = new Player("黄老邪");
        acc.join(play03);

        play04 = new Player("西毒");
        acc.join(play04);

        play03.beAttacked(acc);
    }
}
