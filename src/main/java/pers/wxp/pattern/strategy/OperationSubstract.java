package pers.wxp.pattern.strategy;

/**
 * @author xiaopeng
 * @date 2021年05月18日 11:17
 * @description
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
