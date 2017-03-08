package designpattern.creation.factory;

/**
 * Created by ZhangJing on 2017/3/7.
 *
 * 抽象工厂
 *
 *工厂方法模式最重要的区别是引入了抽象工厂角色，抽象工厂可以是
 *接口，也可以是抽象类或者具体类
 *
 * 思想不要固化！！
 *
 * */

interface LoggerFactory {
  public Logger createLogger();
}
