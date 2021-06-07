package pers.wxp.lambda.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author xiaopeng
 * @date 2021年05月17日 13:32
 * @description
 */
public class TestGet {
    /**
     * get()方法主要用于返回包装对象的实际值，
     * 但是如果包装对象值为null，
     * 会抛出NoSuchElementException异常
     */
    @Test
    public void testGet() {
        Optional<String> optional = Optional.of("thinkwon");
        Optional<String> optional1 = Optional.ofNullable(null);
//        System.out.println(optional.get());
//        System.out.println(optional1.get());

        System.out.println(optional.isPresent());
        System.out.println(optional1.isPresent());
    }
}
