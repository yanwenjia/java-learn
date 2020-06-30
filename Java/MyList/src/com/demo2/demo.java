package com.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("Jack", 30);
        Student s2 = new Student("Tom", 20);
        Student s3 = new Student("LiLi", 35);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            System.out.println(st.getName()+","+st.getAge());
        }
        System.out.println("------------------");
        for (int x = 0;x<list.size();x++){
            Student st = list.get(x);
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
