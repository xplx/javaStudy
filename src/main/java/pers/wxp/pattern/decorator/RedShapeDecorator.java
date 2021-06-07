package pers.wxp.pattern.decorator;

/**
 * @author xiaopeng
 * @date 2021年05月24日 9:32
 * @description
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        //保持原有的功能
        decoratorShape.draw();
        //扩展新的功能
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("扩展新的功能: Red");
    }
}
