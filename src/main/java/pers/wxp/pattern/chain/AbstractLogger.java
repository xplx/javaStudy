package pers.wxp.pattern.chain;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:16
 * @description
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int levelParam, String message) {
        if (this.level <= levelParam) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(levelParam, message);
        }
    }

    abstract protected void write(String message);

}

