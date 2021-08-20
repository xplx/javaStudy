package pers.wxp.jdk8;

/**
 * @author xiaopeng
 * @date 2021年07月01日 10:52
 * @description
 */
interface Formula{

    double calculate(int a);

    /**
     * Java 8使我们能够通过使用 default 关键字向接口添加非抽象方法实现。
     * 此功能也称为虚拟扩展方法。
     * @param a
     * @return
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
