package pers.wxp.pattern.nullObject;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:25
 * @description
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}

