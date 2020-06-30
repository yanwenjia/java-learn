package com.demo3;

import java.util.ArrayList;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");

        ListIterator<String> lit = list.listIterator();

        while (lit.hasNext()){
            String s = lit.next();
            if (s.equals("World")){
                lit.add("add");
            }
//            System.out.println(s);
        }
        System.out.println(lit);
        /*System.out.println("------------");
        while (lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }*/
    }
}
