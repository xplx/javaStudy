package pers.wxp.pattern.prototype;

/**
 * @author xiaopeng
 * @date 2021年05月19日 9:44
 * @description
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

