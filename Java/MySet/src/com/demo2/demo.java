package com.demo2;

import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        Student s1 = new Student("Jack", 10);
        Student s2 = new Student("Tom", 20);
        Student s3 = new Student("Mary", 15);
        Student s4 = new Student("Lary", 15);
        Student s5 = new Student("Nary", 15);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for (Student st: students){
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
