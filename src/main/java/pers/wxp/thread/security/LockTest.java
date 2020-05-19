package pers.wxp.thread.security;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 在 Java 程序中怎么保证多线程的运行安全？
 * 使用手动锁 Lock。
 * @author wuxiaopeng
 */
public class LockTest {

    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockTest tt = new LockTest();
        for (int i = 0; i < 2; i++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
        }
    }

    private class Subtractor implements Runnable {
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    System.out.println("j--=" + j--);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    private class Adder implements Runnable {
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    System.out.println("j++=" + j++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}