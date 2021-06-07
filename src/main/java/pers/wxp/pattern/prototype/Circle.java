package pers.wxp.pattern.prototype;

/**
 * @author xiaopeng
 * @date 2021年05月19日 9:45
 * @description
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

