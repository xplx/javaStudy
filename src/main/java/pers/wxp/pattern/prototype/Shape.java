package pers.wxp.pattern.prototype;

/**
 * @author xiaopeng
 * @date 2021年05月19日 9:43
 * @description
 */
public abstract class Shape implements Cloneable {
    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
