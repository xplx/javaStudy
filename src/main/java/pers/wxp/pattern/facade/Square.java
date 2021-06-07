package pers.wxp.pattern.facade;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:43
 * @description
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

