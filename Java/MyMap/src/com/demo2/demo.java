package com.demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hmp = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();

        arr1.add("诸葛亮");
        arr1.add("司马懿");
        arr1.add("曹操");

        arr2.add("唐僧");
        arr2.add("孙悟空");
        arr2.add("猪八戒");

        arr3.add("武松");
        arr3.add("鲁智深");
        arr3.add("宋江");

        hmp.put("三国",arr1);
        hmp.put("西游记",arr2);
        hmp.put("水浒传",arr3);

        Set<String> keys = hmp.keySet();
        for (String k: keys){
            ArrayList<String> arrayList = hmp.get(k);
            for (String s:arrayList){
                System.out.println(s);
            }
        }
    }
}
