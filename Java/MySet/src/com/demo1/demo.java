package com.demo1;

import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student("Jack", 20);
        Student s2 = new Student("Tom", 30);
        Student s3 = new Student("Mary", 23);
        Student s4 = new Student("Mary", 23);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student st:students){
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
