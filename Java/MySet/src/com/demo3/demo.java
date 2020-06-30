package com.demo3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();

        Random random = new Random();

        while (set.size() < 10){
            int number = random.nextInt(20) + 1;
            set.add(number);
        }

        for (Integer num: set){
            System.out.println(num);
        }
    }
}
