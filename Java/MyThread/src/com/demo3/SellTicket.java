package com.demo3;

public class SellTicket implements Runnable {
    private int num = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (num>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售"+num+"张票");
                    num--;
                } else{
                    break;
                }
            }
        }
    }
}
