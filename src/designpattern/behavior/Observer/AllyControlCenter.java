package designpattern.behavior.Observer;

import java.util.ArrayList;

/**
 * Created by ZhangJing on 2017/4/11.
 *
 * 战队控制中心
 */
abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllyName(String allyName){
        this.allyName = allyName;
    }

    public String getAllyName(){
        return this.allyName;
    }

    public void join(Observer ob){
        System.out.println(ob.getName() + "加入" + this.allyName);
        players.add(ob);
    }

    public void quit(Observer ob){
        System.out.println(ob.getName() + "退出" + this.allyName);
        players.remove(ob);
    }

    public abstract void notifyObserver(String name);



}
