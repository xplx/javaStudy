package pers.wxp.jdk8;

/**
 * @author xiaopeng
 * @date 2021年07月01日 10:53
 * @description
 */
public class Client {
    /**
     * 个内部类实现了接口里的抽象方法并且返回一个内部类对象，之后我们让接口的引用来指向这个对象。
     * @param args
     */
    public static void main(String[] args) {
        // 通过匿名内部类方式访问接口
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return a * 10;
            }
        };

        //计算的是上面的行
        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.calculate(200));     // 100.0
        System.out.println(formula.sqrt(16));           // 4.0

    }
}
