package com.demo4;

public class Box {
    private int milk;
    private boolean status=false;

    public synchronized void put(int milk) {
        if (status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶香");

        status = true;

        notifyAll();
    }

    public synchronized void get() {
        if (!status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        status = false;
        notifyAll();
    }
}
