package pers.wxp.guava;

import com.google.common.collect.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author wxp
 * @date 2020-12-21
 */
public class TableTest {
    public static void main(String[] args) {
        mapTest();
    }

    /**
     * able由双主键R（行）,C（列）共同决定，V是存储值
     */
    public static void tableTest() {
        // 双键的Map Map--> Table-->rowKey+columnKey+value
        Table<String, String, Integer> tables = HashBasedTable.create();
        tables.put("csc", "lwl", 1);
        //row+column对应的value
        System.out.println(tables.get("csc", "lwl"));
    }

    /**
     * 交集, 并集, 差集
     */
    public static void setTest() {
        HashSet setA = new HashSet();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        HashSet setB = new HashSet();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        //并集
        Sets.SetView union = Sets.union(setA, setB);
        System.out.println("并集："+union);
        //差集 setA-setB
        Sets.SetView difference = Sets.difference(setA, setB);
        System.out.println("差集："+difference);
        //交集
        Sets.SetView intersection = Sets.intersection(setA, setB);
        System.out.println("交集："+intersection);
    }

    /**
     * map的交集，并集，差集
     */
    public static void mapTest(){
        HashMap<String, Integer> mapA = Maps.newHashMap();
        mapA.put("a", 1);
        mapA.put("b", 2);
        mapA.put("c", 3);
        HashMap<String, Integer> mapB = Maps.newHashMap();
        mapB.put("b", 20);
        mapB.put("c", 3);
        mapB.put("d", 4);
        MapDifference<String, Integer> mapDifference = Maps.difference(mapA, mapB);
        //mapA 和 mapB 相同的 entry
        System.out.println(mapDifference.entriesInCommon());
        //mapA 和 mapB key相同的value不同的 entry
        System.out.println(mapDifference.entriesDiffering());
        //只存在 mapA 的 entry
        System.out.println(mapDifference.entriesOnlyOnLeft());
        //只存在 mapB 的 entry
        System.out.println(mapDifference.entriesOnlyOnRight());;
    }


}
