package pers.wxp.pattern.bridge;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:23
 * @description 抽象化与实现化解耦，使得二者可以独立变化。
 * 对于两个独立变化的维度，使用桥接模式再适合不过了。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        //shape是抽象类，Circle抽象实现。RedCircle、GreenCircle实现类
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        Shape blueCircle = new Circle(100, 100, 10, new BlueCircle());

        redCircle.draw();
        greenCircle.draw();
        blueCircle.draw();
    }
}

