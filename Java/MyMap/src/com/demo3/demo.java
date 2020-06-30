package com.demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        HashMap<Character, Integer> characterHashMap = new HashMap<>();

        for (int x = 0;x<line.length();x++){
            char ch = line.charAt(x);
            if (characterHashMap.get(ch) == null){
                characterHashMap.put(ch,1);
            } else {
                int num = characterHashMap.get(ch);
                num += 1;
                characterHashMap.put(ch,num);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = characterHashMap.entrySet();

        String res = "";
        for (Map.Entry<Character, Integer> mp: entries){
            char c = mp.getKey();
            int n = mp.getValue();
            res += (c+"("+n+")");
        }
        System.out.println(res);

    }
}
