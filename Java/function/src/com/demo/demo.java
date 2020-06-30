package com.demo;

public class demo {
    public static void main(String[] args) {
        /*System.out.println("main");
        isEvenNum(9);
        getMax(10,20);
        boolean f = isOddNum(20);
        System.out.println(f);*/
       /* int num = 100;
        System.out.println(num);
        change(num);
        System.out.println(num);*/
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        changArr(arr);
        System.out.println(arr[0]);
    }
    public static void isEvenNum(int num){
        if (num % 2 == 0){
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
    public static void getMax(int a,int b){
        int max = a > b?a:b;
        System.out.println(max);
    }

    public  static  boolean isOddNum(int num){
        if (num % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public static void change(int number){
        number += 100;
        System.out.println(number);
    }
    public static void changArr(int[] arr){
        arr[0] = 100;
    }
}
