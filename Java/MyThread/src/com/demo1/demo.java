package com.demo1;

public class demo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setName("高铁");
        myThread2.setName("飞机");

        myThread1.start();
        myThread2.start();
    }
}
