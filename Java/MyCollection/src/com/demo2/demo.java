package com.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("World");
        c.add("Java");
        Iterator<String> it = c.iterator();
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        while (it.hasNext()){
            String s = it.next();
            System.out.println(it.next());
        }

    }
}
