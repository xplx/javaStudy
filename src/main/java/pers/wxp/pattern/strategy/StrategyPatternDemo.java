package pers.wxp.pattern.strategy;

/**
 * @author xiaopeng
 * @date 2021年05月18日 11:21
 * @description 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，
 * 那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 * 
 * 优点 ：1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 *
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
