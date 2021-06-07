package pers.wxp.jdk10;

/**
 * @author xiaopeng
 * @date 2021年05月17日 9:47
 * @description
 */
public interface DefaultMethod {
    default void defaultVoidMethod() {
    }

    default String sayHello(String name) {
        return String.format("%s say hello!", name);
    }

    static void main(String[] args) throws Exception {
        class Impl implements DefaultMethod {
        }
        DefaultMethod defaultMethod = new Impl();
        System.out.println(defaultMethod.sayHello("thinkwon"));
    }
}
