package pers.wxp.jdk8.functional;

/**
 * @author xiaopeng
 * @date 2021年07月01日 11:13
 * @description
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
