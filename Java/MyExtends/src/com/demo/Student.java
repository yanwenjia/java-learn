package com.demo;

public class Student extends Person {
    public static void method(){
        System.out.println("好好学习！");
    }

    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }
}
