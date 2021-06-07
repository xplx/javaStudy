package pers.wxp.pattern.observer;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:41
 * @description
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}

