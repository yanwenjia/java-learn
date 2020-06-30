package com.demo1;

import java.util.ArrayList;
import java.util.Collection;

public class demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello"); // 返回bollean值
        c.add("World");
        System.out.println(c);
        c.remove("World");
        System.out.println(c);
//        c.clear();
//        System.out.println(c);
        System.out.println(c.contains("Hello"));
        System.out.println(c.contains("Hello11"));
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());
    }
}
