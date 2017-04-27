package designpattern.behavior.Observer;

/**
 * Created by ZhangJing on 2017/4/11.
 *
 * 抽象观察类
 */
public interface Observer {
    public String getName();
    public void setName(String name);
    public void help();//声明支援盟友的方法
    public void beAttacked(AllyControlCenter acc);//声明遭受攻击的方法
}
