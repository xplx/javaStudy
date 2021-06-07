package pers.wxp.pattern.bridge;

/**
 * @author xiaopeng
 * @date 2021年05月26日 9:36
 * @description
 */
public class BlueCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
