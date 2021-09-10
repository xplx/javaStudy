package pers.wxp.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiaopeng
 * @date 2021年09月10日 10:41
 * @description 验证线程原子性操作
 */
public class Part implements Runnable {
    //不可保证原子性
    //private volatile static int a = 0;
    //可以保证原子性
    private volatile static AtomicInteger a = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // 数字大一些，不然看不到效果
            // 这里在a++前后打印变量值
            System.out.println(Thread.currentThread().getId() + " before a = " + a);
            a.getAndIncrement();
            System.out.println(Thread.currentThread().getId() + " after a = " + a);
        }
    }
    public static void main(String[] args) throws Exception {
        Part a = new Part();
        Part b = new Part();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
