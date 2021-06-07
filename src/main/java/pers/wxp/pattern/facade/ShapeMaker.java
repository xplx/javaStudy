package pers.wxp.pattern.facade;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:44
 * @description 创建一个外观类
 */
public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}

