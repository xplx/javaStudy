package pers.wxp.jdk8.functional;

/**
 * @author xiaopeng
 * @date 2021年07月01日 11:25
 * @description
 */
public class Something {
    /**
     * 获取第一个字符串
     * @param s
     * @return
     */
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J
    }
}
