package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:31
 * @description
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        color = color.toLowerCase();
        switch (color) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }
}
