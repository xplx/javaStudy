package pers.wxp.pattern.prototype;

/**
 * @author xiaopeng
 * @date 2021年05月19日 9:44
 * @description
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

