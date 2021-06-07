package pers.wxp.pattern.factory.abstractFactory;

/**
 * @author xiaopeng
 * @date 2021年05月21日 9:32
 * @description
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }

        if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
