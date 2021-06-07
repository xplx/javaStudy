package pers.wxp.jdk10;

@FunctionalInterface
public interface CustomFunctionalInterface {
    public abstract void process();

    default void defaultVoidMethod() {

    }

    default String sayHello(String name) {
        return String.format("%s say hello!", name);
    }
}
