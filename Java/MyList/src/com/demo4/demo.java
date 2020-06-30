package com.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student jack = new Student("Jack", 30);
        Student tom = new Student("Tom", 20);
        Student mary = new Student("Mary", 40);

        students.add(jack);
        students.add(tom);
        students.add(mary);

        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student st = it.next();
            System.out.println(st);
        }
        System.out.println("---------");
        for (int x = 0;x<students.size();x++){
            Student st = students.get(x);
            System.out.println(st);
        }
        System.out.println("------------");
        for (Student st: students){
            System.out.println(st);
        }
    }
}
