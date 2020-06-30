package com.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("罗密欧", "朱丽叶");
        map.put("梁山伯", "祝英台");
        map.put("许仙", "白娘子");

        Set<String> keys = map.keySet();

        for (String k : keys) {
            String val = map.get(k);
            System.out.println(k + "," + val);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> me : entries) {
            String k = me.getKey();
            String v = me.getValue();
            System.out.println(k + "," + v);
        }
    }
}
