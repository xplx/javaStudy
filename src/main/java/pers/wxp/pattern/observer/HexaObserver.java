package pers.wxp.pattern.observer;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:42
 * @description
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}

