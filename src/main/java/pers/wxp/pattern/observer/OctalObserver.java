package pers.wxp.pattern.observer;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:42
 * @description
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}

