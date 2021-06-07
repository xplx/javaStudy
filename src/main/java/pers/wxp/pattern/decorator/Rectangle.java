package pers.wxp.pattern.decorator;

/**
 * @author xiaopeng
 * @date 2021年05月24日 9:29
 * @description
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
