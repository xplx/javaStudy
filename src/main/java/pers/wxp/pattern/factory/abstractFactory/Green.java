package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:29
 * @description
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fille() method.");
    }
}
