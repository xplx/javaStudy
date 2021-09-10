package pers.wxp.thread;

import org.checkerframework.checker.units.qual.A;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author wxp
 * @date 2021-3-19
 */
public class CASDemo {
    private AtomicBoolean locked = new AtomicBoolean(false);
    private static AtomicInteger intLock = new AtomicInteger(6);
    AtomicStampedReference asr = new AtomicStampedReference(0, 6);

    public boolean lock() {
        return locked.compareAndSet(false, true);
    }

    public static void main(String[] args) {
        System.out.println(intLock.compareAndSet(8, 7));
        ConcurrentHashMap hash = new ConcurrentHashMap();
    }
}
