package pers.wxp.pattern.observer;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:41
 * @description
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        //添加对象
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }

}

