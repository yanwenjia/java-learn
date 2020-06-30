package com.demo4;

public class demo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer producer = new Producer(b);
        Customer customer = new Customer(b);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(customer);

        thread1.start();
        thread2.start();
    }
}
