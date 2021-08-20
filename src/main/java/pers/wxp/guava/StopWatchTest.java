package pers.wxp.guava;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaopeng
 * @date 2021年07月13日 15:40
 * @description 记录时间
 */
public class StopWatchTest {
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        for(long i=0; i<10000000000L; i++){
            // do some thing
        }
        long nanos = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("逻辑代码运行耗时："+nanos);
    }
}
