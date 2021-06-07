package pers.wxp.pattern.bridge;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:20
 * @description
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
