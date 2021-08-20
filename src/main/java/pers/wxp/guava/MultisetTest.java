package pers.wxp.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Multimap;
import org.openjdk.jol.util.Multiset;

/**
 * @author wxp
 * @date 2020-12-21
 * @description Multimap的特点其实就是可以包含有几个重复Key的value，
 * 可以put进入多个不同value但是相同的key，但是又不会覆盖前面的内容
 */
public class MultisetTest {
    public static void main(String[] args) {
        BiMapTest();
    }

    /**
     * MultiSet: 无序+可重复
     * count()方法获取单词的次数
     * 增强了可读性+操作简单
     */
    public static void MultisetTest(){
        Multiset<String> multiset = new Multiset();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("a");
        multiset.add("c");
        System.out.println(multiset.size());
        //跟踪每个对象数量
        System.out.println(multiset.count("a"));
    }

    public static void MultimapTest(){
        //Multimap: key-value  key可以重复，value也可重复
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("csc","1");
        multimap.put("lwl","1");
        multimap.put("csc","222");
        multimap.put("lwl","one");
        System.out.println(multimap.get("csc"));
        System.out.println(multimap.get("lwl"));
    }

    /**
     * BiMap的键必须唯一，值也必须唯一，可以实现value和key互转
     */
    public static void BiMapTest(){
        BiMap<Integer,String> biMap = HashBiMap.create();
        biMap.put(1,"lwl");
        biMap.put(2,"csc");
        BiMap<String, Integer> map = biMap.inverse(); // value和key互转
        map.forEach((v, k) -> System.out.println(v + "-" + k));
    }
}
