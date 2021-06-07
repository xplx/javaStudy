package pers.wxp.pattern.bridge;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:21
 * @description 使用 DrawApi 接口创建抽象类 Shape。
 */
public abstract class Shape {

    /**
     * 桥接类
     */
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}

