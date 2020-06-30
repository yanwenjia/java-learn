package com.myInterface.demo1;

public class Cat extends Animal implements Jump {
    @Override
    public void jump() {
        System.out.println("猫可以跳高了！");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
}
