package pers.wxp.pattern.mediator;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:46
 * @description
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}

