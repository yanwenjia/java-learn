package com.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();

        lis.add("hello");
        lis.add("world");
        lis.add("java");
        lis.add("java");
        System.out.println(lis);

        Iterator<String> it = lis.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
