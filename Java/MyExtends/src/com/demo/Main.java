package com.demo;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("罗永浩");
        System.out.println(t1.getName()+","+t1.getAge());
        t1.method();
    }
}
