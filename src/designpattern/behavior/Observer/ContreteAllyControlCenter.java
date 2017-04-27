package designpattern.behavior.Observer;

/**
 * Created by ZhangJing on 2017/4/11.
 *
 * 具体的控制中心
 */

public class ContreteAllyControlCenter extends AllyControlCenter {

    public ContreteAllyControlCenter(String allyName){
        System.out.println(allyName + "战队组建成功");
        System.out.println("----------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "被攻击");
        for (Observer ob : players){
            if (!ob.getName().equalsIgnoreCase(name)){
                ob.help();
            }
        }
    }
}
