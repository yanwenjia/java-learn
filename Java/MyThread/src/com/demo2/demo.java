package com.demo2;

public class demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"高铁");
        Thread thread2 = new Thread(myRunnable,"飞机");

        thread1.start();
        thread2.start();
    }
}
