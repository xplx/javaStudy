package pers.wxp.pattern.facade;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:45
 * @description 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}

