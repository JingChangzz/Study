package designpattern.creation.factory;

/**
 * Created by ZhangJing on 2017/3/8.
 */
public class Client {


    public static void main(String[] args) {
        LoggerFactory lfactory;
        Logger logger;

        lfactory = new FileLoggerFactory();
        logger = lfactory.createLogger();
        logger.writeLog();
    }
}
