package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:29
 * @description
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fille() method.");
    }
}
