package pers.wxp.pattern.chain;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:18
 * @description
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}

