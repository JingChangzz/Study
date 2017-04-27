package designpattern.behavior.Observer;

/**
 * Created by ZhangJing on 2017/4/11.
 *
 * 具体的观察者
 */
public class Player implements Observer{
    private String name;

    public  Player(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持，"+this.name+"来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }


}
