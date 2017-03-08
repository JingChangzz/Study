package designpattern.creation.factory;

/**
 * Created by ZhangJing on 2017/3/8.
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }

}
