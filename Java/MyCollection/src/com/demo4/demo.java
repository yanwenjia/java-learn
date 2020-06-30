package com.demo4;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        String[] colors = {"♣","♦","♠","♥"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String c:colors){
            for (String n:numbers){
                arr.add(c+n);
            }
        }
        arr.add("大王");
        arr.add("小王");
        Collections.shuffle(arr);

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();

        for (int x=0;x<arr.size();x++){
            String p = arr.get(x);
            if (x >= arr.size()-3){
                di.add(p);
            } else if (x % 3 == 0){
                play1.add(p);
            } else if (x % 3 == 1){
                play2.add(p);
            } else if (x % 3 == 2){
                play3.add(p);
            }
        }
        System.out.println(arr);
        show("玩家1",play1);
        show("玩家2",play2);
        show("玩家3",play3);
    }
    public static void show(String name, ArrayList<String> arr){
        System.out.println(name+"的牌：");
        for (String p: arr){
            System.out.print(p + "");
        }
        System.out.println();
    }
}
