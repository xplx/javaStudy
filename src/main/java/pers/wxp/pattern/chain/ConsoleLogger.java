package pers.wxp.pattern.chain;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:17
 * @description
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}

