package pers.wxp.pattern.interpreter;

/**
 * @author xiaopeng
 * @date 2021年05月27日 11:16
 * @description 表达式接口
 */
public interface Expression {

    boolean interpret(String context);

}

