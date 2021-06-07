package pers.wxp.pattern.nullObject;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:25
 * @description
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

