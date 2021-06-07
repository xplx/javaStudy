package pers.wxp.pattern.bridge;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:21
 * @description 实现桥接接口实现类
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}


