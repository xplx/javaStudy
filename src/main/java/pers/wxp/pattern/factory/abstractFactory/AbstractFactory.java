package pers.wxp.pattern.factory.abstractFactory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
