package pers.wxp.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:51
 * @description 创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

