package com.demo;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("老马");
        array.add("老王");
        for (int x =0;x<array.size();x++){
            System.out.println(array.get(x));
        }
    }
}
