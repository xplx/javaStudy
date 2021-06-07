package pers.wxp.jdk10;

/**
 * @author xiaopeng
 * @date 2021年05月17日 11:28
 * @description
 */
@FunctionalInterface
public interface Runnable {
    void run();

    static void main(String[] args) throws Exception {
        java.lang.Runnable langRunnable = () -> {
        };
        pers.wxp.jdk10.Runnable customRunnable = () -> {
        };
        langRunnable.run();
        customRunnable.run();
    }
}
