package pers.wxp.pattern.facade;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:44
 * @description
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}

