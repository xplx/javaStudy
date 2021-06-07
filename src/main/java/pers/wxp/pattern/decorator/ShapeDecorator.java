package pers.wxp.pattern.decorator;

/**
 * @author xiaopeng
 * @date 2021年05月24日 9:31
 * @description
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
