package pers.wxp.type.map;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxp
 * @date 2021/3/15
 */
public class HashMapTest {
    @Test
    public void HashMapMethod() {
        //Map<String, Object> m = new HashMap();
        Map<String, Object> m = new HashMap(11);
        m.put("a", 1);
        m.get("a");
        m.remove("a");
        System.out.println(m);
    }

    public static void main(String[] args) {
        HashMap<String, Object> m = new HashMap(11);
        m.put("a", 1);
        m.get("a");
        m.remove("a");
        int h;
        int hash = "a".hashCode();

        int a = (8 - 1) & hash;
        System.out.println(a);
    }

}
