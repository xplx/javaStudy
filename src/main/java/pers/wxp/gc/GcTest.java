package pers.wxp.gc;

/**
 * @author xiaopeng
 * @date 2021年07月14日 9:31
 * @description
 */
public class GcTest {
    public static void main(String[] args) {
        byte[] allocation1, allocation2,allocation3,allocation4,allocation5;
        for (int i = 1; i < 10000; i++) {
            //大对象直接进入老年代（）
            allocation1 = new byte[30900*1024];
            //以下对象存储在eden区
            allocation2 = new byte[30900*1024];
            allocation3 = new byte[30900*1024];
            allocation4 = new byte[30900*1024];
            allocation5 = new byte[30900*1024];
        }
    }
}
