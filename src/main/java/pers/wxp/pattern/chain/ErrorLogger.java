package pers.wxp.pattern.chain;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:17
 * @description
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}


