package pers.wxp.pattern.decorator;

/**
 * @author xiaopeng
 * @date 2021年05月24日 9:30
 * @description
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
