package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:25
 * @description
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
