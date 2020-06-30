package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo4 {


    public static void main(String[] args) {
        ArrayList<Student> studentsArr = new ArrayList<>();
        addStudent(studentsArr);
        addStudent(studentsArr);
        addStudent(studentsArr);
        for (int i =0;i<studentsArr.size();i++){
            Student st = studentsArr.get(i);
            System.out.println(st.getName()+","+st.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student st = new Student(name, age);
        arrayList.add(st);
    }
}
