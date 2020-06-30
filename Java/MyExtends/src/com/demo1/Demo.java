package com.demo1;

public class Demo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("加菲猫");
        c.setAge(20);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
    }
}
