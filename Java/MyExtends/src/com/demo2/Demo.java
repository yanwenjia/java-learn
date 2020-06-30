package com.demo2;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");
        a=new Cat("加菲猫",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
