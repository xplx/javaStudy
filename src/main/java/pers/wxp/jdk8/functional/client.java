package pers.wxp.jdk8.functional;

/**
 * @author xiaopeng
 * @date 2021年07月01日 11:14
 * @description
 */
public class client {
    public static void main(String[] args) {
        // TODO 将数字字符串转换为整数类型
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted); //class java.lang.Integer


        //方法构造函数
        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter1.convert("123213");
        //class java.lang.Integer
        System.out.println(converted1);
    }
}
