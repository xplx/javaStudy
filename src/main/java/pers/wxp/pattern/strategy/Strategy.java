package pers.wxp.pattern.strategy;

/**
 * @author xiaopeng
 * @date 2021年05月18日 11:14
 * @description 策略
 */
public interface Strategy {
    /**
     * 接口操作
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
