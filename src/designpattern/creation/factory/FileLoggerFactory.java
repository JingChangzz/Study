package designpattern.creation.factory;

/**
 * Created by ZhangJing on 2017/3/8.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {

        Logger logger = new FileLogger();
        return logger;
    }
}
