package com.demo;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World");
        array.add("Java");

//        array.remove("Java");
//        array.remove(0);
//        array.set(0,"one");
//        System.out.println(array.get(1));
//        System.out.println(array.size());
        System.out.println(array.get(3));
        System.out.println(array);
    }
}
