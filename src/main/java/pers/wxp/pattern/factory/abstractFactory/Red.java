package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:28
 * @description
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fille() method.");
    }
}
