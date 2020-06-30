package com.demo5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerHashMap = new HashMap<>();

        ArrayList<Integer> integers = new ArrayList<>();


        String[] colors = {"♣", "♦", "♠", "♥"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int index = 0;
        for (String c : colors) {
            for (String n : numbers) {
                pokerHashMap.put(index, c + n);
                integers.add(index);
                index += 1;
            }
        }
        pokerHashMap.put(index, "小王");
        integers.add(index);
        index++;
        pokerHashMap.put(index, "大王");
        integers.add(index);

        TreeSet<Integer> play1 = new TreeSet<>();
        TreeSet<Integer> play2 = new TreeSet<>();
        TreeSet<Integer> play3 = new TreeSet<>();
        TreeSet<Integer> di = new TreeSet<>();


        Collections.shuffle(integers);

        for (int x = 0; x < integers.size(); x++) {
            Integer i = integers.get(x);
//            String p = pokerHashMap.get(i);
            if (x >= integers.size() - 3) {
                di.add(i);
            } else if (x % 3 == 0) {
                play1.add(i);
            } else if (x % 3 == 1) {
                play2.add(i);
            } else if (x % 3 == 2) {
                play3.add(i);
            }
        }

        show("玩家一",play1,pokerHashMap);
        show("玩家二",play2,pokerHashMap);
        show("玩家三",play3,pokerHashMap);
    }
    public static void show(String name,TreeSet<Integer> array,HashMap<Integer,String> pokerHashMap){
        System.out.println(name+"的牌:");
        for (Integer p:array){
            System.out.print(pokerHashMap.get(p)+" ");
        }
        System.out.println();
    }
}
